package main.com.company.lab1.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeTable(tangentValuesOnInterval(0, 1, 0.2)));
    }

    public static double[][] tangentValuesOnInterval(double a, double b, double h) {
        double[][] values = new double[(int)((b - a) / h) + 1][2];
        int index = 0;
        for (double x = a; x <= b; x += h) {
            values[index][0] = x;
            values[index][1] = Math.tan(x);
            index++;
        }
        return values;
    }

    public static String makeTable(double[][] values) {
        StringBuilder table = new StringBuilder("|   x   |  f(x) |\n");
        for (double[] pair : values) {
            table.append(String.format("| %.3f | %.3f |\n", pair[0], pair[1]));
        }
        return table.toString();
    }
}
