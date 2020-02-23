package ru.job4j.oop.tracker;

public class Engineer extends Profession  {
    private String subprofession;

    public Engineer(String name, String surname, String education, String birthday, String subprofession) {
        super(name, surname, education, birthday);
        this.subprofession = subprofession;
    }
    public String getSubprofession() {
        return subprofession;
    }
}
