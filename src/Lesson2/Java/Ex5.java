package Lesson2.Java;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        double P=2*(a+b);

        double S = a*b;

        System.out.println("P:"+P);
        System.out.println("S:"+S);
    }
}