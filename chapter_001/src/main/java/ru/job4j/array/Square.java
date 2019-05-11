package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int[] rst2 = new int[bound];
        rst2[0] = 1;
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int index = rst2[0]; index < bound; index++) {
            rst2[index] = index + 1;
        }
        for (int i = 0; i < rst2.length; i++) {
            rst[i] = rst2[i] * rst2[i];
        }
        return rst;
    }
}