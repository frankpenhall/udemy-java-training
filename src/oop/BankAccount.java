package oop;

public class BankAccount implements IRate {
    // Define variables
    String accountNumber;

    // static -> belongs to the CLASS not the object instance
    // final -> constant (often static final)

    private static final String routingNumber = "0002912";

    // instance variables
    private String name;
    private String ssn;
    String accountType;
    double balance = 0;

    // Constructor definitions: unique methods
        // 1. They are used to define / setup / properties of an object
        // 2. Constructors are implicitly called upon instantiation
        // 3. The same name as the class itself
        // 4. Constructors have no return type

    BankAccount() {
        System.out.println("New Account Created");
    }

    // Overloading: call same method name with different arguments

    BankAccount(String accountType) {
        System.out.println("New Account: " + accountType);
    }
    BankAccount(String accountType, double initDeposit) {
        // initDeposit, accountType, msg, are all local variables
        System.out.println("New Account: " + accountType);
        System.out.println("Initial Deposit of " + initDeposit);
        String msg = "";
        if (initDeposit < 1000) {
            msg = "Error: Minimum deposit must be at least $1,000";
        }
        else {
            msg = "Thanks for your initial deposit of $" + initDeposit;
        }
        System.out.println(msg);
        balance = initDeposit;
    }
    // Getters / setters

    // Allow the user to define the name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    // Interface methods
    public void setRate() {
        System.out.println("Setting rate");
    }
    public void increaseRate() {
        System.out.println("Increasing rate");
    }
    // Define methods
    public void deposit(double amount) {
        balance = balance + amount;
        showActivity("DEPOSIT");
    }

    void withdraw(double amount) {
        balance = balance - amount;
        showActivity("WITHDRAW");
    }

    // Private: can only be called from within the class
    private void showActivity(String activity) {
        System.out.println("Showing recent activity" + activity);
        System.out.println("Your new balance is $" + balance);
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void getStatus() {

    }

    @Override
    public String toString() {
        return "[ Name: " + name + ", Account #: " + accountNumber + ", Routing #: " + routingNumber + ", Balance: " + balance + " ]";
    }
}
