package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
        for (int puzir = 0; puzir < array.length - 1; puzir++) {
            for (int puzir2 = puzir + 1; puzir2 < array.length; puzir2++) {
               if (array[puzir] > array[puzir2]) {
                   int temp = array [puzir];
                   array [puzir] = array[puzir2];
                   array [puzir2] = temp;
               }
            }
        }
    return array;
    }
}


