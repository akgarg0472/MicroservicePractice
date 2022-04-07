package com.akgarg.clients.notification;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@SuppressWarnings("unused")
public class NotificationRequest {

    private Integer toCustomerId;
    private String toCustomerEmail;
    private String message;

    public NotificationRequest() {
    }

    public NotificationRequest(final Integer toCustomerId, final String toCustomerEmail, final String message) {
        this.toCustomerId = toCustomerId;
        this.toCustomerEmail = toCustomerEmail;
        this.message = message;
    }

    public Integer getToCustomerId() {
        return toCustomerId;
    }

    public void setToCustomerId(final Integer toCustomerId) {
        this.toCustomerId = toCustomerId;
    }

    public String getToCustomerEmail() {
        return toCustomerEmail;
    }

    public void setToCustomerEmail(final String toCustomerEmail) {
        this.toCustomerEmail = toCustomerEmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

}
