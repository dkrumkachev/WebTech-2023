package test.com.company.lab1.task7;

import main.com.company.lab1.task7.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void givenUnsortedArray_whenBubbleSort_thenReturnSortedArray() {
        int[] array = new int[] {
                93, 12, 4, -34, 5, 10, 423, 99, 0, 36, 19, 4
        };
        int[] expected = new int[] {
                -34, 0, 4, 4, 5, 10, 12, 19, 36, 93, 99, 423
        };
        int[] actual = Main.bubbleSort(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    void givenSortedArray_whenBubbleSort_thenReturnSameArray() {
        int[] array = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8
        };
        int[] expected = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8
        };
        int[] actual = Main.bubbleSort(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    void givenArrayWithSameElements_whenBubbleSort_thenReturnSameArray() {
        int[] array = new int[] {
                1, 1, 1, 1, 1, 1
        };
        int[] expected = new int[] {
                1, 1, 1, 1, 1, 1
        };
        int[] actual = Main.bubbleSort(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    void givenEmptyArray_whenBubbleSort_thenReturnEmptyArray() {
        int[] array = new int[0];
        int[] expected = new int[0];
        int[] actual = Main.bubbleSort(array);
        assertArrayEquals(expected, actual);
    }
}