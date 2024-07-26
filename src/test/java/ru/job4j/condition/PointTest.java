package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when10to00then1() {
        double expected = 1;
        double output = Point.distance(1, 0, 0, 0);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when01to00then1() {
        double expected = 1;
        double output = Point.distance(0, 1, 0, 0);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when00to10then1() {
        double expected = 1;
        double output = Point.distance(0, 0, 1, 0);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));

    }
}