package Lesson5.java;

public class Ex3 {

    public static int firstMaxIndex(int[] arr) {

        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7, 40};

        int result = firstMaxIndex(arr);

        System.out.println("Index of first max: " + result);
    }
}
