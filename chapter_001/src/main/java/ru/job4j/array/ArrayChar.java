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
        char ch = 0;
        if (wrd[0] == pref[0] && wrd[1] != pref[1]) {
            result = false;
        } else if (wrd[0] != pref[0]) {
            result = false;
        } else if (wrd[0] == pref[0] && wrd[1] == pref[1]) {
            for (ch = 0; ch < pref.length - 1; ch++) {
                if (wrd[ch + 1] == pref[ch + 1]) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}