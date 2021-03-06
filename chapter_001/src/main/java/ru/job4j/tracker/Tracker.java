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
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items[index] = item;
        }
        return result;
    }
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            int start = index + 1;
            int distPos = index;
            int sizeX = size - index;
            System.arraycopy(items, start, items, distPos, sizeX);
            items[size - 1] = null;
            size--;
        }
        return result;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
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
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }return rsl;
    }
}