package ru.job4j.oop;

public class MaxOOP {
    public int max(int left, int right) {
        int result = left < right ? right : left;
        return result;
    }
    public int max (int left, int right, int center) {
        int temp = max (left, right);
        return max (center, temp);
    }
    public int max (int left, int right, int center, int center2) {
        int temp = max(left, right, center);
        return max(center2, temp);
    }
}
