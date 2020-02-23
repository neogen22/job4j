package ru.job4j.oop.tracker;

public class Pacient {
    private String name;
    private String surname;
    private int palata;
    public Pacient (String name, String surname, int palata) {
        this.name = name;
        this.surname = surname;
        this.palata = palata;
    }
    public static void main (String [] args) {
        Pacient pacient = new Pacient("Dmitry", "Vronov", 32);
    }
}
