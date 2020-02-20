package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleOOPTest {
    @Test
    public void whenExist() {
        boolean result = TriangleOOP.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
}