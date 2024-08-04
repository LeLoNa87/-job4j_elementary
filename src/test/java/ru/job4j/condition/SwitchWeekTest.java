package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchWeekTest {

    @Test
    public void whenDayIs1ThenMonday() {
        assertEquals("Понедельник", SwitchWeek.nameOfDay(1));
    }

    @Test
    public void whenDayIs5ThenFriday() {
        assertEquals("Пятница", SwitchWeek.nameOfDay(5));
    }
}