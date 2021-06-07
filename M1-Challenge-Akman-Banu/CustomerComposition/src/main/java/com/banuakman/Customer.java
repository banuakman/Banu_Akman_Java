package com.banuakman;

import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private boolean rewardsMember;

    private Address billingAddress;
    private Address shippingAddress;

    public Customer() {}

    public Customer(String firstName, String lastName, String email, String phoneNumber, boolean rewardsMember, Address billingAddress, Address shippingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.rewardsMember = rewardsMember;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return rewardsMember == customer.rewardsMember && firstName.equals(customer.firstName) && lastName.equals(customer.lastName) && email.equals(customer.email) && phoneNumber.equals(customer.phoneNumber) && billingAddress.equals(customer.billingAddress) && shippingAddress.equals(customer.shippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber, rewardsMember, billingAddress, shippingAddress);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rewardsMember=" + rewardsMember +
                ", billingAddress=" + billingAddress +
                ", shippingAddress=" + shippingAddress +
                '}';
    }
}
