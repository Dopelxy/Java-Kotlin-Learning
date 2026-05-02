package Lesson2.Java;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N");
        int N = scanner.nextInt();
        int sumN= 0;
        int i = 1;
        while(i <=N){
            sumN = sumN +i;
            i++;
        }
        System.out.println("congratulation:"+"sumN="+sumN);
    }
}
