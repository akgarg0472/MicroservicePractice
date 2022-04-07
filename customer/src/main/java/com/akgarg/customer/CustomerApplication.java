package com.akgarg.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@SpringBootApplication(
        scanBasePackages = {
                "com.akgarg.customer",
                "com.akgarg.amqp"
        }
)
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.akgarg.clients")
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

}
