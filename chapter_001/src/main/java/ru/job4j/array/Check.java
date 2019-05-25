package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int bol = 0; bol < data.length - 1; bol++) {
            if (data[bol] != data[bol + 1]) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }
}