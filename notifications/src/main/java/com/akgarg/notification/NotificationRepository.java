package com.akgarg.notification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
