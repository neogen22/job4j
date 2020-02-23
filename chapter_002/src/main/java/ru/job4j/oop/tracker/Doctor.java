package ru.job4j.oop.tracker;

public class Doctor extends Profession {
    private String subprofession;
    public Doctor(String name, String surname, String education, String birthday, String subprofession) {
        super(name, surname, education, birthday);
        this.subprofession = subprofession;
    }
    public Diagnose heal (Pacient pacient) {
        return heal(pacient);
    }
    public String getSubprofession() {
        return subprofession;
    }
}
