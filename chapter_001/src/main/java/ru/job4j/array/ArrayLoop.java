package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] fifthElement = new int[5];
        for (int i = 0; i < 4; i++) {
            fifthElement[i] = i * 2 + 3;
            System.out.println(fifthElement[i]);
        }
    }
}
