package com.akgarg.notification.rabbitmq;

import com.akgarg.clients.notification.NotificationRequest;
import com.akgarg.notification.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@Component
@AllArgsConstructor
@Slf4j
public class NotificationConsumer {

    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void consume(NotificationRequest request) {
        log.info("Consumed {} from queue", request);
        notificationService.send(request);
    }

}
