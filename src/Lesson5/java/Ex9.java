package Lesson5.java;

public class Ex9 {
    public static boolean isPalindrome(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        boolean result = isPalindrome(arr);

        if (result) {
            System.out.println("The array is a palindrome");
        } else {
            System.out.println("The array is not a palindrome");
        }
    }
}
