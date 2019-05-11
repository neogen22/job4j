package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int bol = 0; bol < data.length - 1; bol++) {
            for (int bol2 = bol + 1; bol2 < data.length; bol2++) {
                if (data[bol] == data[bol2]) {
                    result = true;
                } else result = false;
            }
        }
        return result;
    }
}