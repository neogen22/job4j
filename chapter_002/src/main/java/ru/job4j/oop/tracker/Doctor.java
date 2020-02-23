package ru.job4j.oop.tracker;

public class Doctor extends Profession {
    private String lechit;
    public Doctor(String name, String surname, String education, String birthday, String lechit) {
        super(name, surname, education, birthday);
        this.lechit = lechit;
    }
    public Diagnose heal (Pacient pacient) {
        return heal(pacient);
    }
    public String getLechit() {
        return lechit;
    }
}
