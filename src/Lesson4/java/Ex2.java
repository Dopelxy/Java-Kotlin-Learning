package Lesson4.java;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = scanner.nextLine();
        String reversed = reverseWords(input);
        System.out.println("Result: " + reversed);
    }

    public static String reverseWords(String str) {
        StringBuilder result = new StringBuilder();
        int i = str.length() - 1;

        while (i >= 0) {

            int end = i;
            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }

            String word = str.substring(i + 1, end + 1);
            result.append(word).append(" ");

            if (i >= 0) {
                i--;
            }
        }
        return result.toString().trim();
    }
}