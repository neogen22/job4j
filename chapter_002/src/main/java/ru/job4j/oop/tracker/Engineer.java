package ru.job4j.oop.tracker;

public class Engineer extends Profession  {
    private String proektirovat;

    public Engineer(String name, String surname, String education, String birthday, String proektirovat) {
        super(name, surname, education, birthday);
        this.proektirovat = proektirovat;
    }
    public String getProektirovat() {
        return proektirovat;
    }
}
