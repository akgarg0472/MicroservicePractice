package com.akgarg.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@SuppressWarnings("unused")
public class CustomerRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;

    public CustomerRegistrationRequest() {
    }

    public CustomerRegistrationRequest(
            @JsonProperty("first_name") final String firstName,
            @JsonProperty("last_name") final String lastName,
            @JsonProperty("email") final String email
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

}
