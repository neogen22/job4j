package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int temp = 0;
        int temp2 = 0;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                for (int x = 0; x < board.length; x++) {
                    if (board[0][i] == 'X' && board[x][i] == 'X') {
                        temp++;
                        System.out.println(temp);
                        if (temp == board.length) {
                            return true;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                for (int y = 0; y < board.length; y++) {
                    if (board[i][0] == 'X' && board[i][y] == 'X') {
                        temp2++;
                        //System.out.println(temp2);
                        if (temp2 == board.length) {
                            return true;
                        }
                    }
                }
            }
        } return false;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}



