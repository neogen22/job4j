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
    public void replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items[index].getId());
            items[index] = item;
        }
    }
    public void delete(int id) {
        int index = indexOf(id);
        int start = index + 1;
        int distPos = index;
        int sizeX = size - index;
        if (index != -1) {
            System.arraycopy(items, start, items, distPos, sizeX);

            size--;
        }
    }
    public void deleteTwo(int id) {
        Item [] deleted = new Item[size];
        System.arraycopy(items, 0, deleted, 0, size);
        for (int i = 0; i < size; i++) {
            if (deleted[i].getId() == id + 1)  {
                System.arraycopy(deleted, i + 1, items, i, size - i - 1);
                size--;
                break;
            }
        }
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