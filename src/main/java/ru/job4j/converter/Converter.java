package ru.job4j.converter;

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
        float input = 140;
        float input1 = 120;
        float expected = 2;
        float expected1 = 2;
        float output = Converter.rubleToEvro(input);
        float output1 = Converter.rubleToDollar(input1);
        boolean passed = expected == output;
        boolean passed1 = expected1 == output1;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("120 rubles are 2. test result1 : " + passed1);

    }
}
