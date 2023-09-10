package test.com.company.lab1.task2;

import main.com.company.lab1.task2.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void givenCoordinatesInRegion_whenIsPointInArea_thenReturnTrue() {
        double x = -3, y = 4;
        boolean expected = true;
        boolean actual = Main.isPointInArea(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void givenCoordinatesOutsideRegion_whenIsPointInArea_thenReturnFalse() {
        double x = 10, y = -5;
        boolean expected = false;
        boolean actual = Main.isPointInArea(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void givenCoordinatesOnBorder_whenIsPointInArea_thenReturnTrue() {
        double x = -6, y = -3;
        boolean expected = true;
        boolean actual = Main.isPointInArea(x, y);
        assertEquals(expected, actual);
    }
}