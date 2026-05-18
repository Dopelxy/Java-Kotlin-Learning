package Lesson6.Java;

public class Ex4 {
    public static void main(String[] args) {

        // Исходный массив
        int[] arr = {4, 2, 2, 8, 5, 6, 8, 5};

        int[] unique = new int[arr.length];

        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyExists = false;

            for (int j = 0; j < uniqueCount; j++) {

                if (arr[i] == unique[j]) {

                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {

                unique[uniqueCount] = arr[i];

                uniqueCount++;
            }
        }

        for (int i = 0; i < uniqueCount; i++) {

            for (int j = 0; j < uniqueCount - 1 - i; j++) {

                if (unique[j] > unique[j + 1]) {

                    int temp = unique[j];
                    unique[j] = unique[j + 1];
                    unique[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < uniqueCount; i++) {

            System.out.print(unique[i] + " ");
        }
    }
}
