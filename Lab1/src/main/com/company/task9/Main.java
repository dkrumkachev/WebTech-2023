package main.com.company.task9;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Basket basket = createBasketWithBalls();
        System.out.println(countWeightOfBallsInBasket(basket));
        System.out.println(countBlueBallsInBasket(basket));
    }

    public static Basket createBasketWithBalls() {
        Ball ball1 = new Ball(Color.BLACK, 2);
        Ball ball2 = new Ball(Color.BLUE, 3);
        Ball ball3 = new Ball(Color.YELLOW, 4);
        Ball ball4 = new Ball(Color.RED, 5);
        Ball ball5 = new Ball(Color.BLUE, 6);
        return new Basket(ball1, ball2, ball3, ball4, ball5);
    }

    public static int countBlueBallsInBasket(Basket basket) {
        int count = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }

    public static int countWeightOfBallsInBasket(Basket basket) {
        int weight  = 0;
        for (Ball ball : basket.getBalls()) {
            weight += ball.getWeight();
        }
        return weight;
    }
}
