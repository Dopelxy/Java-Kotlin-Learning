package Lesson6.Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {

        // Исходный массив
        Integer[] arr = {4, 5, 6, 5, 4, 3};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {

            frequencyMap.put(num,
                    frequencyMap.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(arr, (a, b) -> {

            int freqCompare =
                    frequencyMap.get(b) - frequencyMap.get(a);

            if (freqCompare != 0) {

                return freqCompare;
            }

            return a - b;
        });

        System.out.println(Arrays.toString(arr));
    }
}
