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


}
