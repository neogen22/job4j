package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Hi");
        assertThat(result, is(false));
    }

    @Test
    public void whenStartWithPrefix3ThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Helloween", "Hel");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefix3ThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Helloween", "Hez");
        assertThat(result, is(false));
    }

    @Test
    public void whenNotStartWithPrefix1ThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Helloween", "Z");
        assertThat(result, is(false));
    }
}