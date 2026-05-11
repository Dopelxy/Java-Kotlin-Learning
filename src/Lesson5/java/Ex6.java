package Lesson5.java;
import java.util.Arrays;

public class Ex6 {

    public static boolean arraysAreEqual(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));

        boolean result = arraysAreEqual(arr1, arr2);

        System.out.println("Arrays are equal: " + result);
    }
}
