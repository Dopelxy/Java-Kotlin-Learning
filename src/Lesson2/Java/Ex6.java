package Lesson2.Java;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score: ");
        int score = scanner.nextInt();
       if (score >=90){
           System.out.println("Grade - A");
       } else if (score >=75 ) {
           System.out.println("Grade - B");
       } else if (score >=50 ) {
           System.out.println("Grade - C");
       } else if (score >=30 ) {
           System.out.println("Grade - D");
       } else
        System.out.println("F");
    }
}