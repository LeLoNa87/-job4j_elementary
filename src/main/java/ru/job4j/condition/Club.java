package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney | beFriend) {
            System.out.println("I cant go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }
}

