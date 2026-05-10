package Lesson3.java;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
