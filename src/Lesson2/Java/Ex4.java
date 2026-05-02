package Lesson2.Java;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
        System.out.println("Enter number");
        number = scanner.nextInt();

        System.out.println("You entered: " + number);}
        while( number >=0);

    }
}
