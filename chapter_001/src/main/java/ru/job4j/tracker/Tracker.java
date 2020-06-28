package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public int delete(int x) {
        size--;
        return size;
    }
    public Item replace(int id, Item newItem) {
        Item rsl = newItem;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
    public Item[] findAll() {
        return Arrays.copyOf(items, size);

    }
    public Item[] findByName(String key) {
        Item[] onlyNamesEqualsKeys = new Item [size];
        int z = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                onlyNamesEqualsKeys[z] = items[i];
                z++;
            }
        }
        return Arrays.copyOf(onlyNamesEqualsKeys, z);
    }
}