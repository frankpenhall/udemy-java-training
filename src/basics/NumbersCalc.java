package basics;

public class NumbersCalc {

    public static void main(String[] args) {
        System.out.println("Program starting");
        printName();
        int numA = 10;
        int numB = 20;
        addNumbers(numA, numB);
        int product = multiplyNumbers(numA, numB);
        System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
    }

    static void printName() {
        System.out.println("My name is Frank");
    }

    static void addNumbers(int numA, int numB) {
        // Function will add two numbers
        int sum = numA + numB;
        System.out.println("The sum of numbers " + numA + " and " + numB + " is " + sum);
    }

    static int multiplyNumbers(int numA, int numB) {
        int product = numA * numB;
        addNumbers(product, product);
        return product;
    }
}
