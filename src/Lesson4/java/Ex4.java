package Lesson4.java;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Enter the following words one at a time:");
        System.out.println("4; word; localization; internationalization; pneumonoultramicroscopicsilicovolcanoconiosis");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String word = scanner.next();

            if (word.length() <= 10) {
                System.out.println(word);
            } else {
                int middle = word.length() - 2;
                System.out.println("" + word.charAt(0) + middle + word.charAt(word.length() - 1));
            }
        }

        scanner.close();
    }
}
