package test.com.company.lab1.task5;

import main.com.company.lab1.task5.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void givenArray_whenMinElementsNumberToRemove_thenReturnMinElementsToRemove() {
        int[] array = new int[] { 1, 4, 2, 6, 3, 5, 11, 10, 15};
        int expected = 3;
        int actual = Main.minElementsNumberToRemove(array);
        assertEquals(expected, actual);
    }

    @Test
    void givenAscendingSequence_whenMinElementsNumberToRemove_thenReturnZero() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8};
        int expected = 0;
        int actual = Main.minElementsNumberToRemove(array);
        assertEquals(expected, actual);
    }

    @Test
    void givenDescendingSequence_whenMinElementsNumberToRemove_thenReturnLengthMinusOne() {
        int[] array = new int[] { 7, 6, 5, 4, 3, 2, 1};
        int expected = 6;
        int actual = Main.minElementsNumberToRemove(array);
        assertEquals(expected, actual);
    }

    @Test
    void givenOneElementArray_whenMinElementsNumberToRemove_thenReturnZero() {
        int[] array = new int[] { 666 };
        int expected = 0;
        int actual = Main.minElementsNumberToRemove(array);
        assertEquals(expected, actual);
    }

    @Test
    void givenEmptyArray_whenMinElementsNumberToRemove_thenReturnZero() {
        int[] array = new int[0];
        int expected = 0;
        int actual = Main.minElementsNumberToRemove(array);
        assertEquals(expected, actual);
    }
}