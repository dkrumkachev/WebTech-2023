package main.com.company.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPointInArea(0, 0));
    }

    public static boolean isPointInArea(double x, double y) {
        return isPointInTopArea(x, y) || isPointInBottomArea(x, y);
    }

    public static boolean isPointInTopArea(double x, double y) {
        return (x >= -4 && x <= 4) && (y >= 0 && y <= 5);
    }

    public static boolean isPointInBottomArea(double x, double y) {
        return (x >= -6 && x <= 6) && (y >= -3 && y <= 0);
    }

}
