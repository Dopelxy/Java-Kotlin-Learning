package Lesson3.java;
import java.util.Scanner;

public class Ex3 {

    public static void main (String[] args){
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number >= 10){
            int sumNumber = 0;
            while (number > 0){
                int digit = number % 10;
                sumNumber += digit;
                number = number / 10;
            }
            number = sumNumber;

        }
        System.out.println("Result " + number);

    }
}
