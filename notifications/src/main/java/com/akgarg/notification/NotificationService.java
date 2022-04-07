package com.akgarg.notification;

import com.akgarg.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@SuppressWarnings("ClassCanBeRecord")
@Service
@AllArgsConstructor
@Slf4j
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void send(final NotificationRequest request) {
        log.debug("Saving notification into db {}", request);

        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(request.getToCustomerId())
                        .toCustomerEmail(request.getToCustomerEmail())
                        .sender("SpringApp")
                        .message(request.getMessage())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }

}
