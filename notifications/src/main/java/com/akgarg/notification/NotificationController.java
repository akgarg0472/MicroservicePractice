package com.akgarg.notification;

import com.akgarg.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@RestController
@RequestMapping("api/v1/notification")
@AllArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @RequestMapping(method = RequestMethod.POST)
    public void sendNotification(@RequestBody NotificationRequest request) {
        notificationService.send(request);
    }

}
