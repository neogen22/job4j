package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = false;
        for (int out = 0; out < data.length - 1; out++) {
            for (int inner = 0; inner < data[out].length - 1; inner++) {
                if (data [out] [inner] == data [out + 1] [inner + 1])  {
                    result = true;
                } else  {
                    result = false;
                }
            }
        }
        return result;
    }
}
