package ru.job4j.converter.Converter;

public class Converter {
    public static float rubleToEvro(float value) {
        float result = value / 70;
        return result;
    }
    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float evro = Converter.rubleToEvro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + evro + " evro.");
        System.out.println("120 rubles are " + dollar + " dollar.");

    }
}
