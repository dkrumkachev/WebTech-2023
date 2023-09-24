package main.com.company.task9;

import java.awt.*;

public class Ball {
    private Color color;
    private int weight;

    public Ball(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
