package ru.job4j.array;
import java.util.Arrays;
public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int puzir = 0; puzir < unique; puzir++) {
            for (int puzir2 = puzir + 1; puzir2 < unique; puzir2++) {
                if (array[puzir].equals(array[puzir2])) {
                    array [puzir2] = array[unique - 1];
                    unique--;
                    puzir2--;
                }
            }
        }
        return Arrays.copyOf(array, unique);

    }
}

