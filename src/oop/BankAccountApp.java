package oop;

public class BankAccountApp {

    public static void main(String[] args) {
        // Creating a new bank account >> instantiate a new object
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "018272";
        acc1.balance = 10000;

        // With Encapsulation: public API methods
        acc1.setName("Roger Hue");
        acc1.setSsn("281739016");
        System.out.println(acc1.getName());
        System.out.println("SSN: " + acc1.getSsn());
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.withdraw(2100);
        acc1.setRate();
        acc1.increaseRate();

        // Polymorphism through overriding
        System.out.println(acc1.toString());

        // Polymorphism through overloading
        BankAccount acc2 = new BankAccount("Checking Account");
        acc2.accountNumber = "018272";

        BankAccount acc3 = new BankAccount("Savings Account", 5000);
        acc3.accountNumber = "018272";

        /*
        acc3.checkBalance();
        // Demo for inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.interestRate = "4.5";
        cd1.name = "Juan";
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());

        */

    }
}
