package basics;

public class SalaryCalculator {

    public static void main(String[] args) {
        // Let's create a variable to define our career
        String career;
        System.out.println("Program starting");
        career = "Software Engineer";
        System.out.println("My career: " + career);

        // Declare and define
        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 42.50;

        double salary = hoursPerWeek * weeksPerYear * rate;

        System.out.println("Salary as a " + career + " at the rate of $" + rate + " per hour and $" + salary +" per year");

        // Calculate our annual salary
        // rate * hoursPerWeek * weeksPerYear
    }
}
