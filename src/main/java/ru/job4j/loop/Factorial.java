package ru.job4j.loop;

public class Factorial {
    public static int calculate(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

