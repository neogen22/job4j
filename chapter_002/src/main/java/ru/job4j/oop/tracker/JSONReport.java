package ru.job4j.oop.tracker;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator()  +
        " " + System.lineSeparator() +
        "name: " + name + System.lineSeparator() +
        "body: " + body + System.lineSeparator() +
        " " + System.lineSeparator() +
        "}";
    }
}
