package ru.job4j.oop.tracker;

public class Programmer extends Engineer {
    private String programmirovanie;

    public Programmer(String name, String surname, String education, String birthday, String proektirovat, String programmirovanie) {
        super(name, surname, education, birthday, proektirovat);
        this.programmirovanie = programmirovanie;
    }
    public String getProgrammirovamie() {
        return programmirovanie;
    }
}
