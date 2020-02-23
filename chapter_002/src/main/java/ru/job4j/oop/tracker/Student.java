package ru.job4j.oop.tracker;

import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private String otchestvo;
    private int group;
    private String datapostuplenia;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getDatapostuplenia() {
        return datapostuplenia;
    }

    public void setDatapostuplenia(String datapostuplenia) {
        this.datapostuplenia = datapostuplenia;
    }
}
