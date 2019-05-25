package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;
    
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет, что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int ch = 0; ch < data.length - 1; ch++) {
            if (data[0] == value[0] && data[1] == value [1]) {
                result = true;
            } else {
                result = false;
            }
        }
        // проверить, что массив data имеет первые элементы, одинаковые с value
        return result;
    }
}