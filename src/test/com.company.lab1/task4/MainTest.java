package test.com.company.lab1.task4;

import main.com.company.lab1.task4.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void givenArrayWithPrimeNumbers_whenGetPrimeElementsIndexes_thenReturnIndexes() {
        int[] array = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
        };
        List<Integer> expected = List.of(1, 2, 4, 6, 10, 12);
        List<Integer> actual = Main.getPrimeElementsIndexes(array);
        assertIterableEquals(expected, actual);
    }

    @Test
    void givenArrayWithoutPrimeNumbers_whenGetPrimeElementsIndexes_thenReturnEmptyList() {
        int[] array = new int[] {
                4, 6, 8, 10, 12, 14, 16
        };
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = Main.getPrimeElementsIndexes(array);
        assertIterableEquals(expected, actual);
    }

    @Test
    void givenAllPrimeNumbers_whenGetPrimeElementsIndexes_thenReturnAllIndexes() {
        int[] array = new int[] {
                2, 3, 5, 7, 11, 13, 17, 19, 23
        };
        List<Integer> expected = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> actual = Main.getPrimeElementsIndexes(array);
        assertIterableEquals(expected, actual);
    }

    @Test
    void givenEmptyArray_whenGetPrimeElementsIndexes_thenReturnEmptyList() {
        int[] array = new int[0];
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = Main.getPrimeElementsIndexes(array);
        assertIterableEquals(expected, actual);
    }
}