package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Dot1() {
       int p = 6;
       double k = 3;
       double expected = 1.68;
       double result = RectangleArea.square(p, k);
       assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP5K4Dot1() {
        int p = 4;
        double k = 3;
        double expected = 0.75;
        double result = RectangleArea.square(p, k);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}