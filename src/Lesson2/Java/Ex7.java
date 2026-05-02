package Lesson2.Java;
import java.util.Scanner;


public class Ex7 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N");
        int N = scanner.nextInt();

        for ( int i =1; i <=4; i++){

                int sum = N * i;
                System.out.println(N + "x" + i + "="+ sum );
        }

    }
}

