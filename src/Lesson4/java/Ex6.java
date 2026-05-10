package Lesson4.java;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the batch results");
        System.out.println("Number of batches: ");

        int n = scanner.nextInt();

        System.out.println("Enter information about the winners for the number of games played");
        String s = scanner.next();

        int anton = 0;
        int danik = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A') {
                anton++;
            } else if (ch == 'D') {
                danik++;
            }
        }

        if (anton > danik) {
            System.out.println("Anton");
        } else if (danik > anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }

        scanner.close();
    }
}
