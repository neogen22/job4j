package ru.job4j.oop.tracker;

public class Tiger extends Predator {
    public Tiger(String name) {
        super(name);
        System.out.println("Tiger");
    }
    public static void main(String[] args) {
        Predator Tiger = new Tiger("RRR BigCat");
    }
}
