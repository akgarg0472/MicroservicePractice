package com.akgarg.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@SpringBootApplication
@EnableEurekaClient
public class FraudApplication {

    public static void main(String[] args) {
        SpringApplication.run(FraudApplication.class, args);
    }

}
