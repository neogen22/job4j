package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = false;
        for (int out = 0; out < data.length - 1; out++) {
            if (data.length > 2) {
                if (data[out][out] != data[data.length - 1 - out][1 + out]) {
                    result = false;
                } else {
                    result = true;
                }
            } else if (data.length == 2) {
                for (out = 0; out < data.length; out++) {
                    for (int inner = out + 1; inner < data.length; inner++) {
                        if (data[out][inner] != data[inner][out]) {
                            result = false;
                        } else {
                            result = true;
                        }
                    }
                }
            }
        } return result;
    }
}



