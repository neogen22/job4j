package ru.job4j.loop;
public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        int x = 0;
        int y = 0;
        for (x = 0; x < height; x++) {
            for (y = 0; y < width; y++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if (x % 2 == 0 && y % 2 == 0 || x == 0 && y == 0 || x % 2 != 0 && y % 2 != 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.

            screen.append(ln);
        }
        return screen.toString();
    }
}