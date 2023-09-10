package test.com.company.lab1.task9;

import main.com.company.lab1.task9.Ball;
import main.com.company.lab1.task9.Basket;
import main.com.company.lab1.task9.Main;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void givenBasketWithTwoBlueBalls_whenCountBlueBallsInBasket_thenReturnTwo() {
        Basket basket = new Basket(new Ball(Color.BLUE, 1),
                new Ball(Color.BLUE, 2), new Ball(Color.BLACK, 1),
                new Ball(Color.RED, 3), new Ball(Color.WHITE, 5));
        int expected = 2;
        int actual = Main.countBlueBallsInBasket(basket);
        assertEquals(expected, actual);
    }

    @Test
    void givenBasketWithFiveBlueBalls_whenCountBlueBallsInBasket_thenReturnFive() {
        Basket basket = new Basket(new Ball(Color.BLUE, 10),
                new Ball(Color.BLUE, 20), new Ball(Color.BLUE, 100),
                new Ball(Color.BLUE, 30), new Ball(Color.BLUE, 5),
                new Ball(Color.YELLOW, 90), new Ball(Color.ORANGE, 40));
        int expected = 5;
        int actual = Main.countBlueBallsInBasket(basket);
        assertEquals(expected, actual);
    }

    @Test
    void givenBasketWithNoBlueBalls_whenCountBlueBallsInBasket_thenReturnZero() {
        Basket basket = new Basket(new Ball(Color.GREEN, 10),
                new Ball(Color.PINK, 20), new Ball(Color.WHITE, 100));
        int expected = 0;
        int actual = Main.countBlueBallsInBasket(basket);
        assertEquals(expected, actual);
    }

    @Test
    void givenBasketWithBalls_whenCountWeightOfBallsInBasket_thenReturnWeightOfBalls() {
        Basket basket = new Basket(new Ball(Color.BLACK, 15),
                new Ball(Color.BLACK, 20), new Ball(Color.BLACK, 100));
        int expected = 135;
        int actual = Main.countWeightOfBallsInBasket(basket);
        assertEquals(expected, actual);
    }

    @Test
    void givenBasketWithNoBalls_whenCountWeightOfBallsInBasket_thenReturnZero() {
        Basket basket = new Basket();
        int expected = 0;
        int actual = Main.countWeightOfBallsInBasket(basket);
        assertEquals(expected, actual);
    }
}