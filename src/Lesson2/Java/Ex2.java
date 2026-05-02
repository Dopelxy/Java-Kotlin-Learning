package Lesson2.Java;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scanner.nextInt();
        if (num1 % 2 ==0){
            System.out.println("The number is even");
        } else {
            System.out.println("This number is odd");
        }
    }
}
