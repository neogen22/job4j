package ru.job4j.oop.tracker;

public class Builder extends Engineer {
    private String remont;

    public Builder(String name, String surname, String education, String birthday, String subprofession, String remont) {
        super(name, surname, education, birthday, subprofession);
        this.remont = remont;
    }
    public String getRemont() {
        return remont;
    }
}
