package main.com.company.lab1.task5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minElementsNumberToRemove(new int[]{1, 4, 2, 6, 3, 5}));
    }

    public static int minElementsNumberToRemove(int[] array) {
        int[] dp = new int[array.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return array.length - max(dp);
    }

    public static int max(int[] array) {
        int max = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
