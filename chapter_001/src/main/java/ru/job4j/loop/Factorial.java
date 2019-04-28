package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;
        int x = 0;
        for (;x < n;) {
            x++;
            result *= x;
        }
        return result;
    }
}