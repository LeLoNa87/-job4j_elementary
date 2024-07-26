package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RestangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = RestangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double output = RestangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenP10K4Square4() {
        int expected = 4;
        int p = 10;
        double k = 4;
        double output = RestangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenP18K8Square8() {
        int expected = 8;
        int p = 18;
        double k = 8;
        double output = RestangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}