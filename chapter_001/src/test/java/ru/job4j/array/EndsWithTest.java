package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
    @Test
    public void whenNotEndWithPrefixThenFalseFalse() {
        char[] word = {'W', 'o', 'r', 'l', 'd'};
        char[] post = {'p'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
    @Test
    public void whenEndWithPrefixThenTrueTrue() {
        char[] word = {'K', 'a', 'm', 'i', 'k', 'a', 'd', 'z', 'e'};
        char[] post = {'a', 'd', 'z', 'e'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }
    @Test
    public void whenEndWithPrefixThenTrueTrueTrue() {
        char[] word = {'K', 'a', 'm', 'i', 'k', 'a', 'd', 'z', 'e'};
        char[] post = {'e'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }
}