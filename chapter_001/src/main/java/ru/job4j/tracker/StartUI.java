package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item ruslana = new Item ();
        Item zena = new Item ();
        ruslana.setName("Ruslana");
        zena.setName("Zena");
        tracker.add(ruslana);
        tracker.add(zena);
        System.out.print((tracker.findById(1)).getName());
    }
}
