package algorithms;

public class Demo {

    public static void main(String[] args) {
        int[] numbers = {10, 25, 356, 94, 27, 48, 185};

        int[] sortedNumbers = {5, 10, 12, 15, 18, 23, 39, 48, 66, 69, 75, 78, 91, 103, 110, 112, 124};

        // Call linear search a function that searches for a specific number
        int pos = algorithms.Search.linearSearch(numbers, 94);
        System.out.println("Found at position: " + pos);

        // Call binary search
        int index = algorithms.Search.binarySearch(sortedNumbers, 5, 0, sortedNumbers.length);
        System.out.println("Found at position: " + index);

        // Call bubble sort
        Sort.bubbleSort(numbers);
    }
}
