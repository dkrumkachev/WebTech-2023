package test.com.company.task1;

import main.com.company.task1.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void givenTwoValues_whenCalculateFormula_thenReturnCalculatedValue() {
        double x = -1, y = 1;
        double expected = -0.5;
        double actual = Main.calculateFormula(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void givenTwoPositiveValues_whenCalculateFormula_thenReturnCalculatedValue() {
        double x = 3, y = 2;
        double expected = 3.3967755490944938;
        double actual = Main.calculateFormula(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void givenTwoNegativeValues_whenCalculateFormula_thenReturnCalculatedValue() {
        double x = -1, y = -2;
        double expected = -0.6077250551250704;
        double actual = Main.calculateFormula(x, y);
        assertEquals(expected, actual);
    }
}