package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x1 - x2;
        int y = y1 - y2;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double sum = first + second;
        double result = Math.sqrt(sum);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(1, 2, 3, 4);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result1 (1, 2) to (3, 4) " + result1);
    }
}
