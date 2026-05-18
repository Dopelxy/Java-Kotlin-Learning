package Lesson6.Java;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {

        // Массив строк
        String[] fruits = {"banana", "date", "apple", "cherry"};

        for (int i = 0; i < fruits.length; i++) {

            for (int j = 0; j < fruits.length - 1 - i; j++) {

                if (fruits[j].compareTo(fruits[j + 1]) > 0) {

                    String temp = fruits[j];
                    fruits[j] = fruits[j + 1];
                    fruits[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(fruits));
    }
}
