package main.com.company.lab1.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        List<Integer> primeElementsIndexes = getPrimeElementsIndexes(array);
        System.out.println(primeElementsIndexes.size() > 0 ? primeElementsIndexes :
                "There are no prime numbers in the array");
    }

    public static List<Integer> getPrimeElementsIndexes(int[] array) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n <= 1 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
