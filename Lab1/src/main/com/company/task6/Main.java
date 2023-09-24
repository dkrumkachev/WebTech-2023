package main.com.company.task6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {
                1, 2, 3, 4, 5, 6, 7
        };
        System.out.println(Arrays.deepToString(makeMatrix(numbers)));
    }

    public static int[][] makeMatrix(int[] numbers) {
        int[][] matrix = new int[numbers.length][numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int[] copy = Arrays.copyOf(numbers, numbers.length);
            for (int j = 0; j < i; j++) {
                leftShift(copy);
            }
            matrix[i] = copy;
        }
        return matrix;
    }

    public static void leftShift(int[] array) {
        int first = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = first;
    }
}
