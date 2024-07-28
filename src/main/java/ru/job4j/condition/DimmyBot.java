package ru.job4j.condition;

public class DimmyBot {

    public static String answer(String question) {
        String result = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            result = "Hi, SmartAss.";
        } else if ("Can you add two plus two?".equals(question)) {
            result = "I don't know. Please, ask another question.";
        } else if ("Bye.".equals(question)) {
            result = "See you later.";
        }
        return result;
    }

    public static void main(String[] args) {
        String result = DimmyBot.answer("Hi, Bot.");
        System.out.println(result);
        result = DimmyBot.answer("Bye.");
        System.out.println(result);
    }
}
