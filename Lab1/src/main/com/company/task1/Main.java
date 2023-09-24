package main.com.company.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateFormula(3, 2));
    }

    public static double calculateFormula(double x, double y) {
        double numerator = 1 + Math.sin(x + y) * Math.sin(x + y);
        double denominator = (2 + Math.abs(x - 2 * x / (1 + x * x * y * y)));
        return numerator / denominator + x;
    }
}