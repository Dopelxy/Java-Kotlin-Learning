package Lesson5.java;
import java.util.Arrays;

public class Ex7 {

    public static void moveZerosToEnd(int[] arr) {

        int index = 0;

        for (int num : arr) {

            if (num != 0) {
                arr[index] = num;
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Original array: " + Arrays.toString(arr));

        moveZerosToEnd(arr);

        System.out.println("Modified array: " + Arrays.toString(arr));
    }
}
