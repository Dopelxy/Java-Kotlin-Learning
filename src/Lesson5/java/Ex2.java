package Lesson5.java;

public class Ex2 {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7, 4};

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
