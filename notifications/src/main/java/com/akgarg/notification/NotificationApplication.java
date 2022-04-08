package com.akgarg.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@SpringBootApplication(scanBasePackages = {"com.akgarg.notification", "com.akgarg.amqp"})
@EnableEurekaClient
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(
//            RabbitMQMessageProducer producer, NotificationConfig notificationConfig
//    ) {
//        return args -> {
//            producer.publish(
//                    new Human("John Doe", 69),
//                    notificationConfig.getInternalExchange(),
//                    notificationConfig.getInternalNotificationRoutingKey()
//            );
//        };
//    }
//
//    record Human(String name, int age) {
//    }

}
