package Lesson3.java;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){

        System.out.println("Enter number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int original = number;
        int reversed = 0;
        int digit;
        while (number > 0 ) {
            digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        if (original == reversed){
            System.out.println("Entered number is Palindrome");
        } else {
            System.out.println("Entered number is NOT Palindrome");

        }
    }
}
