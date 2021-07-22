package labs;

import java.awt.*;

public class BankAccountApp {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("212883901", 1000);
        BankAccount acc2 = new BankAccount("193717841", 2500);
        BankAccount acc3 = new BankAccount("491498966", 6000);

        acc1.setName("Hubert");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.payBill(350);
        acc1.accrue();
        acc1.showBalance();
        System.out.println(acc1.toString());
    }
}

class BankAccount implements IInterest {
    // Properties of bank account

    private static int id = 100;          // internal ID
    private String accountNumber;   // id + random 2-digit # + first 2 of ssn
    private static final String routingNumber = "00454881";
    private String name;
    private String ssn;
    private double balance;

    // Constructors
    public BankAccount(String ssn, double initDeposit) {
        //System.out.println("New Account Created");
        balance = initDeposit;
        this.ssn = ssn;
        id++;
        setAccountNumber();
    }

    private void setAccountNumber() {
        int random = (int) (Math.random() * 100);
        accountNumber = id + "" + random + ssn.substring(0, 2);
        System.out.println("Your account number:" + accountNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void payBill(double amount) {
        balance = balance - amount;
        System.out.println("Paying bill " + amount);
        showBalance();
    }

    public void makeDeposit(double amount) {
        balance = balance + amount;
        System.out.println("Making deposit " + amount);
        showBalance();
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public void accrueInterest() {

    }

    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Account Number: " + accountNumber + "\n" + "Routing Number: " + routingNumber + "\nBalance: $" + balance;
    }
}
