package com.georgehigbie;

/**
 * Created by georgehigbie on 1/27/17.
 */
public class VIPCustomer {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private double creditLimit;

    public VIPCustomer(String firstName, String lastName, String emailAddress, double creditLimit){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public VIPCustomer(String firstName, String lastName, String emailAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.creditLimit = 0.0;
    }

    public VIPCustomer(){
        this("John", "Doe", "jg@email.com", 0.0);
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
