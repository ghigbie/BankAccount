package com.georgehigbie;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account bobsAccount = new Account();
        bobsAccount.setNumber("123456789");
        bobsAccount.setCustomerFirstName("Robert");
        bobsAccount.setCustomerLastName("Frost");
        bobsAccount.setPhoneNumber("808-843-9865");
        bobsAccount.setBalance(400.0);
        bobsAccount.printBalance();
        bobsAccount.withdrawal(200.0);

        System.out.println("####################################");
        bobsAccount.printAccountHolderName();
        System.out.println("####################################");

        bobsAccount.deposit(100.0);
        bobsAccount.withdrawal(50.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(30.0);
        bobsAccount.printBalance();

        Account tomsAccount = new Account();
        tomsAccount.setNumber("987654321");
        tomsAccount.setBalance(500.00);
        tomsAccount.printBalance();

        System.out.println("####################################");

        Account pamsAccount = new Account("834781234", 300.0, "pam", "pammy", "adfadf@gmail.com", "808-838-6543");
        pamsAccount.printAccountHolderName();

        System.out.println("####################################");
        System.out.println("#############VIP CUSTOMER 1#######################");

        VIPCustomer ted = new VIPCustomer();
        System.out.println();

        System.out.println("####################################");
        System.out.println("#############VIP CUSTOMER 2#######################");

        VIPCustomer ted2 = new VIPCustomer("Teddy", "Bear", "tb@gemail.com");

        System.out.println("####################################");
        System.out.println("#############VIP CUSTOMER 3#######################");

        VIPCustomer ted3 = new VIPCustomer("Teddy", "Bear", "tb@gemail.com", 2000.00);

    }
}
