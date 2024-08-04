package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleSwitchWeekTest {

    @Test
    void whenDayOfMondayThenDayIs1() {
        assertEquals(1, MultipleSwitchWeek.numberOfDay("Понедельник"));
    }

    @Test
    void whenDayOfFridayThenDayIs5() {
        assertEquals(5, MultipleSwitchWeek.numberOfDay("Пятница"));
    }
}
