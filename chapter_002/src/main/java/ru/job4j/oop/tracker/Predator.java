package ru.job4j.oop.tracker;

public class Predator extends Animal{
    public Predator(String name) {
        super(name);
        System.out.println("Predator");
    }

    public static void main(String[] args) {
       Animal predator = new Predator("RRRonald");
    }
}
