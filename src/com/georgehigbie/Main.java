package com.georgehigbie;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account bobsAccount = new Account();
        bobsAccount.withdrawal(200.0);

        bobsAccount.deposit(100.0);
        bobsAccount.withdrawal(50.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(30.0);

        Account tomsAccount = new Account();
        tomsAccount.setBalance(500.00);
        tomsAccount.getBalance();
    }
}
