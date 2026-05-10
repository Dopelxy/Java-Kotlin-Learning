package Lesson4.java;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String firstLetter = word.substring(0, 1).toUpperCase();

        String rest = word.substring(1);

        String result = firstLetter + rest;

        System.out.println(result);
    }

}
