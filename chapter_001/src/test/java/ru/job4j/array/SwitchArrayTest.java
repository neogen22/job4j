package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap0to6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {6, 2, 3, 4, 5, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap7to3() {
        int[] input = {7, 4, 9, 12, 8, 3};
        int[] expect = {3, 4, 9, 12, 8, 7};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
}
