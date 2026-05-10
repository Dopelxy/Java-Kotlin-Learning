package Lesson4.java;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Berland to Birland translation verification program");
        System.out.println("Enter word: ");

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        if (isReverse(s, t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isReverse(String s, String t) {
        return new StringBuilder(s).reverse().toString().equals(t);
    }

}
