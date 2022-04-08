package com.akgarg.customer;

import com.akgarg.amqp.RabbitMQMessageProducer;
import com.akgarg.clients.fraud.FraudCheckResponse;
import com.akgarg.clients.fraud.FraudClient;
import com.akgarg.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@SuppressWarnings("ClassCanBeRecord")
@Service
@Slf4j
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;
    private final RabbitMQMessageProducer rabbitMQMessageProducer;

    public void registerCustomer(final CustomerRegistrationRequest request) {
        final Customer customer = Customer.builder().firstName(request.getFirstName()).lastName(request.getLastName()).email(request.getEmail()).build();

        log.info("Saving new customer {}", customer);

        customerRepository.saveAndFlush(customer);

        final FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());

        if (fraudCheckResponse != null && fraudCheckResponse.getFraudster()) {
            throw new IllegalStateException("Fraudster");
        }

        log.info("Sending notification to customer {}", customer);

        final NotificationRequest notificationRequest = new NotificationRequest(
                customer.getId(),
                customer.getEmail(),
                String.format("Hi %s, welcome to the microservice course!!", customer.getFirstName())
        );
        rabbitMQMessageProducer.publish(
                notificationRequest,
                "internal.exchange",
                "internal.notification.routing-key"
        );
    }

}
