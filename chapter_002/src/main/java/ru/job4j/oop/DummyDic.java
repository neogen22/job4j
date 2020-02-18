package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String eng = "Fallout New Vegas is the best game in the world";
        return eng;
    }
    public static void main(String[] args) {
        DummyDic z = new DummyDic();
        String x = z.engToRus();
        System.out.println("Неизвестное слово " + x);
    }
}

