package basics;

public class FactorialApp {

    public static void main(String[] args) {
        System.out.println(sum(4));

        System.out.println("Factorial: " + factorial(5));

        int[] numbers = {5, -2, 0, 234, -34, 13};

        System.out.println("Min: " + findMin(numbers));
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Avg: " + findAvg(numbers));
    }

    public static int sum(int numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers; i++) {
            sum = sum + i;
            System.out.println(" = " + sum);
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else if (n == 1) {
            return 1;
        }
        return factorial(n-1) * n;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findAvg(int[] arr) {
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }

    /*
    Write a function that takes a value n returns the sum of numbers 1 to n

    Write a function that computes the factorial value
    Definition: n! = n*(n-1)! , where 0! = 1
            1! = 1
            2! = 2 * 1! = 2 * 1
            3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
            4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
    Hint: use the recursive method that was used to calculate Fibonnaci number

    Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
            Hint: this should be static functions with a return type of the same data type as the array declaration.
     */
}
