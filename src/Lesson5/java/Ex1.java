package Lesson5.java;

public class Ex1 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        int max = arr[0];
        int min = arr[0];

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }

            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Max value: " + max + ", index: " + maxIndex);
        System.out.println("Min value: " + min + ", index: " + minIndex);
    }

}
