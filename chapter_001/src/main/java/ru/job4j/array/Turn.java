package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int x = array[index];
            array [index] = array [array.length - index - 1];
            array [array.length - index - 1] = x;
        }
        return array;
    }
}