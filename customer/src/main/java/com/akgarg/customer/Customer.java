package com.akgarg.customer;

import javax.persistence.*;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@SuppressWarnings("unused")
@Entity
public class Customer {

    @Id
    @SequenceGenerator(name = "customer_id_sequence", sequenceName = "customer_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_sequence")
    private Integer id;

    private String firstName;
    private String lastName;
    private String email;

    public Customer() {
    }

    public Customer(final CustomerBuilder customerBuilder) {
        this.id = customerBuilder.id;
        this.firstName = customerBuilder.firstName;
        this.lastName = customerBuilder.lastName;
        this.email = customerBuilder.email;
    }

    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
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

    public static class CustomerBuilder {
        private Integer id;
        private String firstName;
        private String lastName;
        private String email;

        public CustomerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }

    }

}