package Lesson5.java;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(arr));

        int temp = arr[0];

        arr[0] = arr[arr.length - 1];

        arr[arr.length - 1] = temp;

        System.out.println("Modified array: " + Arrays.toString(arr));
    }

}
