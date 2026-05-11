package Lesson5.java;

public class Ex4 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, -7, 40};

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        boolean allPositive = true;

        for (int num : arr) {
            if (num <= 0) {
                allPositive = false;
                break;
            }
        }

        System.out.println();

        if (allPositive) {
            System.out.println("The array contains only positive numbers");
        } else {
            System.out.println("The array contains zero or negative numbers");
        }
    }
}
