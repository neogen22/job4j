package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxOOPTest {
    @Test
    public void whenMax1To2Then2() {
        MaxOOP max = new MaxOOP();
        int result = max.max(1, 2,14, 20);
        assertThat(result, is(20));
    }
    @Test
    public void whenMax2To1Then1() {
        MaxOOP max = new MaxOOP();
        int result = max.max(14, 7,1,4);
        assertThat(result, is(14));
    }
    @Test
    public void when1ravno2() {
        MaxOOP max = new MaxOOP();
        int result = max.max(4, 4, 4,4);
        assertThat(result, is(4));
    }
}
