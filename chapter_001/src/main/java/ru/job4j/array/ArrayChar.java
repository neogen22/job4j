package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = false;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        if (pref[0] == wrd[0]) {
            for (char ch = 0; ch < pref.length - 1; ch++) {
                if (pref[ch + 1] == wrd[ch + 1]) {
                    result = true;
                } else {
                    result = false;
                }
            }
            return result;
        } else {
            return false;
        }
    }
}