package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        if (post[post.length - 1] == word[word.length - 1]) {
            for (int i = post.length - 1; i == 0; i--) {
                result = post[i] == word[word.length - 1];
            }
            return result;
        } else {
            return false;
        }
    }
}
