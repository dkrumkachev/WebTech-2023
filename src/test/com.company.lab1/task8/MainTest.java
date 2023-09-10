package test.com.company.lab1.task8;

import main.com.company.lab1.task8.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void givenTwoArrays_whenGetIndexesToInsertElements_thenReturnIndexes() {
        int[] destinationArray = new int[] {
                1, 4, 5, 6, 9, 10, 11, 12, 15
        };
        int[] sourceArray = new int[] {
                2, 3, 4, 5, 7, 10, 10, 12
        };
        List<Integer> expected = List.of(1, 2, 3, 5, 8, 10, 11, 14);
        List<Integer> actual = Main.getIndexesToInsertElements(destinationArray, sourceArray);
        assertIterableEquals(expected, actual);
    }

    @Test
    void givenSameArrays_whenGetIndexesToInsertElements_thenReturnEvenIndexes() {
        int[] destinationArray = new int[] {
                1, 2, 3, 4, 5
        };
        int[] sourceArray = new int[] {
                1, 2, 3, 4, 5
        };
        List<Integer> expected = List.of(0, 2, 4, 6, 8);
        List<Integer> actual = Main.getIndexesToInsertElements(destinationArray, sourceArray);
        assertIterableEquals(expected, actual);
    }

    @Test
    void givenSourceArrayElementsGreaterThanDestinationArray_whenGetIndexesToInsertElements_thenReturnIndexesAtTheEnd() {
        int[] destinationArray = new int[] {
                1, 3, 4, 6, 10
        };
        int[] sourceArray = new int[] {
                11, 12, 15, 19, 22, 30, 45, 90
        };
        List<Integer> expected = List.of(5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> actual = Main.getIndexesToInsertElements(destinationArray, sourceArray);
        assertIterableEquals(expected, actual);
    }

    @Test
    void givenSourceArrayElementsLessThanDestinationArray_whenGetIndexesToInsertElements_thenReturnIndexesAtTheBeginning() {
        int[] destinationArray = new int[] {
                2, 3, 4, 6, 10
        };
        int[] sourceArray = new int[] {
                -1, 0, 1
        };
        List<Integer> expected = List.of(0, 1, 2);
        List<Integer> actual = Main.getIndexesToInsertElements(destinationArray, sourceArray);
        assertIterableEquals(expected, actual);
    }

    @Test
    void givenEmptySourceArray_whenGetIndexesToInsertElements_thenReturnEmptyList() {
        int[] destinationArray = new int[] {
                3, 4, 5
        };
        int[] sourceArray = new int[0];
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = Main.getIndexesToInsertElements(destinationArray, sourceArray);
        assertIterableEquals(expected, actual);
    }

    @Test
    void givenEmptyDestinationArray_whenGetIndexesToInsertElements_thenReturnIndexesInOrder() {
        int[] destinationArray = new int[0];
        int[] sourceArray = new int[] {
                1, 2, 3, 4, 5
        };
        List<Integer> expected = List.of(0, 1, 2, 3 ,4);
        List<Integer> actual = Main.getIndexesToInsertElements(destinationArray, sourceArray);
        assertIterableEquals(expected, actual);
    }

}