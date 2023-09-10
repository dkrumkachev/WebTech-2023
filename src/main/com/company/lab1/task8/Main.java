package main.com.company.lab1.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[] {
                1, 2, 3, 4, 5
        };
        int[] array2 = new int[] {
                0, 2, 4, 7, 8, 9
        };
        System.out.println(getIndexesToInsertElements(array1, array2));
    }

    public static List<Integer> getIndexesToInsertElements(int[] destArray, int[] srcArray) {
        List<Integer> indexes = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < srcArray.length; i++) {
            while (j < destArray.length && srcArray[i] > destArray[j]) {
                j++;
            }
            if (j == destArray.length) {
                for (; i < srcArray.length; i++) {
                    indexes.add(j + indexes.size());
                }
                break;
            }
            indexes.add(j + indexes.size());
        }
        return indexes;
    }
}
