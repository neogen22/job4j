package ru.job4j.oop.tracker;

public class Dentist extends Doctor {
    private String rvat;
    public Dentist(String name, String surname, String education, String birthday, String lechit, String rvat) {
        super(name, surname, education, birthday, lechit);
        this.rvat = rvat;
    }
    public String getRvat() {
        return rvat;
    }
}
