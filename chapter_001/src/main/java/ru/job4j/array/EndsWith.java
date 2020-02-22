package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int wordStartLength = word.length - post.length;
        char[]wordEndFull = new char[word.length - wordStartLength];
        for (int i = 0; i < word.length - wordStartLength; i++) {
            wordEndFull[i] = word[wordStartLength + i];
        }
        String wordEnd = String.valueOf(wordEndFull);
        String postString = String.valueOf(post);
        if (wordEnd.equals(postString)) {
            return true;
        }
        else {
            return false;
        }
    }
}