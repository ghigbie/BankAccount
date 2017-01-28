package com.georgehigbie;

/**
 * Created by georgehigbie on 1/27/17.
 */
public class Account {

    private String number; //this could be an number, but a string may be better
    private double balance;
    private String customerFirstName;
    private String customerLastName;
    private String emailAddress;
    private String phoneNumber;

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("$" + depositAmount + " deposited into the account, " + this.number + ".");
        System.out.println("The account balance is now $ " + this.balance +".");
    }

    public void withdrawal(double withdrawalAmount){
        if(balance - withdrawalAmount <= 0){
            System.out.println("Only " + this.balance + " available. This withdrawal cannot be processes at this time.");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("$ " + withdrawalAmount + "has been withdrawn.");
            System.out.println("The account balance is now $" + this.balance +".");
        }
    }

    public void printBalance(){
        System.out.println("The account balance of account #" + this.number + " is $" + this.getBalance() + ".");
        System.out.println("************************************************************");
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

