package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int z = word.length - 1;
        if (post[post.length - 1] != word[word.length - 1]) {
            return false;
        } else {
            for (int i = post.length - 1; i >= 0 && result; i--,  z--) {
                result = post[i] == word[z];
            }
        } return result;
    }
}
