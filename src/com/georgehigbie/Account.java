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

    public Account(){

    }

    public Account(String number, double balance, String customerFirstName, String customerLastName, String emailAddress, String phoneNumber) {
        if(number.length() < 9){
            System.out.println("Please enter a value of 9 digits.");
        }else{
            this.number = number;
        }

        this.balance = balance;

        this.customerFirstName = customerFirstName.substring(0, 1).toUpperCase() + customerFirstName.substring(1).toLowerCase();
        this.customerLastName = customerLastName.substring(0,1).toUpperCase() + customerLastName.substring(1).toLowerCase();
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

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

    public void printAccountHolderName(){
        System.out.println("The primary account holder is " + this.getCustomerFirstName() + " " + this.getCustomerLastName() + ".");
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

