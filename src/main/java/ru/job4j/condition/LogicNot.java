package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return !notPositive(num);
    }

    public static boolean isPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !notPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !notEvenAndPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return !evenOrNotPositive(num);
    }
}