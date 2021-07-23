package exceptionfiles;

public class NegativePaymentException extends Exception {
    // define class variable
    double payment;

    // 1. Constructor that takes the value that would throw the exception
    // 2. Assign value of local variable class variable
    public NegativePaymentException(double payment) {
        this.payment = payment;
    }

    // 3. Override the toString method
    public String toString() {
        return "Error: Cannot take negative payment " + payment;
    }
}
