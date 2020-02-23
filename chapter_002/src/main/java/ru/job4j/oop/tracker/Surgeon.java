package ru.job4j.oop.tracker;

public class Surgeon extends Doctor {
    private String rezat;

    public Surgeon(String name, String surname, String education, String birthday, String lechit, String rezat ) {
        super(name, surname, education, birthday, lechit);
        this.rezat = rezat;
    }

    public String getRezat() {
        return rezat;
    }
}
