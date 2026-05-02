package Lesson2.Java;

import java.util.Scanner;

public class Ex8 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        int a = 0;
        int b = 1;
        int next = 0;
        for ( int i =2; i <=N; i++){
            next = a+b;
            a = b;
            b = next;
        }
        System.out.println("N=" + b);
    }
}
