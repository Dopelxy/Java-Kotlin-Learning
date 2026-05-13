package Lesson6.Java;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        // Original array
        int[] arr = {4, -3, 2, -1, 0, -5};
        // New array
        int[] result = new int[arr.length];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {

                result[index] = arr[i];

                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {

                result[index] = arr[i];

                index++;
            }
        }
        // Display result
        System.out.println(Arrays.toString(result));
    }
}