package test.com.company.task3;

import main.com.company.task3.Main;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void givenIntervalAndStep_whenTangentValuesOnInterval_thenReturnArrayWithArgumentAndFunctionValues() {
        double a = -3;
        double b = 4;
        double h = 2;
        double[][] expected = new double[][] {
                { -3, Math.tan(-3) },
                { -1, Math.tan(-1) },
                { 1, Math.tan(1) },
                { 3, Math.tan(3) },
        };
        double[][] actual = Main.tangentValuesOnInterval(a, b, h);
        assertTrue(Arrays.deepEquals(actual, expected));
    }

    @Test
    void givenIntervalAndStepGreaterThanInterval_whenTangentValuesOnInterval_thenReturnArrayOfLength1() {
        double a = -5;
        double b = 0;
        double h = 10;
        double[][] expected = new double[][] {
                { -5, Math.tan(-5) },
        };
        double[][] actual = Main.tangentValuesOnInterval(a, b, h);
        assertTrue(Arrays.deepEquals(actual, expected));
    }

    @Test
    void givenIntervalOfLength0_whenTangentValuesOnInterval_thenReturnArrayOfLength1() {
        double a = 2;
        double b = 2;
        double h = 1;
        double[][] expected = new double[][] {
                { 2, Math.tan(2) },
        };
        double[][] actual = Main.tangentValuesOnInterval(a, b, h);
        assertTrue(Arrays.deepEquals(actual, expected));
    }
}