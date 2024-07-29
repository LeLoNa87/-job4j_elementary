package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxTest {

    @Test
    void whenMax2To5Then5() {
        assertEquals(5, Max.max(2, 5));
    }

    @Test
    void whenMax4To3Then4() {
        assertEquals(4, Max.max(4, 3));
    }

    @Test
    void whenMax5To5Then5() {
        assertEquals(5, Max.max(5, 5));
    }
}