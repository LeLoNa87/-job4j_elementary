package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterTest {

    @Test
    public void whenSumFrom0To10Then55() {
        assertEquals(55, Counter.sum(0, 10));
    }
    @Test
    public void whenSumFrom3To8Then33() {
        assertEquals(33, Counter.sum(3, 8));
    }

    @Test
    public void whenSumFrom1To1Then1() {
        assertEquals(1, Counter.sum(1, 1));
    }

    @Test
    public void whenSumFromNegative5To5Then0() {
        assertEquals(0, Counter.sum(-5, 5));
    }
    @Test
    public void whenStartGreaterThanFinishThen0() {
        assertEquals(0, Counter.sum(10, 0));
    }
}