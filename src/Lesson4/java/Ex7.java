package Lesson4.java;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '7' ");
        int t = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the data from homework #6");

        for (int i = 0; i < t; i++) {
            String line = scanner.nextLine();
            String[] words = line.split(" ");

            String result = "" +
                    words[0].charAt(0) +
                    words[1].charAt(0) +
                    words[2].charAt(0);

            System.out.println(result);
        }
        scanner.close();
    }
}
