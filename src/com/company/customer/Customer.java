package com.company.customer;

import com.company.customer.CustomerType;

import java.time.LocalDate;

public class Customer {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private CustomerType Type;

    public Customer(String firstName, String lastName, LocalDate birthday, CustomerType type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        Type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public CustomerType getType() {
        return Type;
    }

    public void setType(CustomerType type) {
        Type = type;
    }
}
