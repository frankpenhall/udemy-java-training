package oop;

public class LoanAccount implements IRate {
    @Override
    public void setRate() {
        System.out.println("Rate");
    }

    @Override
    public void increaseRate() {
        System.out.println("Increase rate");
    }

    public void setTerm(int terms) {
        System.out.println("Setting term to: " + terms + " years");
    }

    public void setAmortSchedule() {
        System.out.println("Amortization Schedule");
    }
}
