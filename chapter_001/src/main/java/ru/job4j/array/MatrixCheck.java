package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = false;
        for (int out = 0; out < data.length - 1; out++) {
                if (data [out] [out] == data [out + 1] [out + 1])  {
                    result = true;
                } else  {
                    result = false;
                }
        }
        return result;
    }
}
