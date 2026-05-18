package Lesson6.Java;

public class Ex5 {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};

        int swaps = countMinSwaps(arr);

        System.out.println(swaps);
    }

    public static int countMinSwaps(int[] arr) {

        int swaps = 0;

        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

                swaps++;
            }
        }

        return swaps;
    }
}
