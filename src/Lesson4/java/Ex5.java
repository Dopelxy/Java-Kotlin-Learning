package Lesson4.java;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lines from homework #5:");
        System.out.println("Enter the first line: ");
        String a = scanner.nextLine();

        System.out.println("Enter the second line: ");
        String b = scanner.nextLine();

        System.out.println("Result: ");

        String s1 = a.toLowerCase();
        String s2 = b.toLowerCase();

        if (s1.compareTo(s2) < 0) {
            System.out.println(-1);
        } else if (s1.compareTo(s2) > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
