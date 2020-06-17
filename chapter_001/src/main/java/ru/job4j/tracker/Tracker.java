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
        Item[] onlyNames = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                onlyNames[i] = items[i];
                size++;
            }
        }
        Item [] onlyNamesWithoutNull = Arrays.copyOf(onlyNames, size);
        return onlyNamesWithoutNull;
    }
    public Item[] findByName(String key) {
        Item [] onlyNamesEqualsKeys = new Item [items.length];
        for (int i = 0; i < 2; i++) {
            String s = items[i].toString();
            if (s.equals(key)) {
                items[i] = onlyNamesEqualsKeys[i];
                size++;
            }
        }
        Item [] onlyNamesEqualsKeysSmallSize = Arrays.copyOf(onlyNamesEqualsKeys, size);
        return onlyNamesEqualsKeysSmallSize;
    }
}