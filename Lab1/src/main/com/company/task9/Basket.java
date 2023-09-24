package main.com.company.task9;

import java.util.ArrayList;
import java.util.Arrays;

public class Basket {
    ArrayList<Ball> balls;

    public Basket(Ball ... balls) {
        this.balls = new ArrayList<>(Arrays.asList(balls));
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }
}
