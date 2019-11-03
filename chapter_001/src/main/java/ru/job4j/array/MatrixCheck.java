package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int temp = 0;
        int q = 0;
        int w = 0;
        int z = 0;
        int qqq = 0;
        int qqqz = 0;
        int qqqzz = 0;
        int qqqzzz = 0;
        int o = 0;
        int oo = 0;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[0][i] == 'X') {
                    temp++;
                    if (temp == board.length) {
                        return true;
                    }
                }
                break;
            }
            if (board[1][i] == 'X') {
                z++;
                if (z == board.length) {
                    return true;
                }

            }
            if (board[2][i] == 'X') {
                q++;
                if (q == board.length) {
                    return true;
                }
            }
            if (board[3][i] == 'X') {
                w++;
                if (w == board.length) {
                    return true;
                }
            }
            if (board[4][i] == 'X') {
                o++;
                if (o == board.length) {
                    return true;
                }
            }
            if (board[i][0] == 'X') {
                qqq++;
                if (qqq == board.length) {
                    return true;
                }
            }
            if (board[i][1] == 'X') {
                qqqz++;
                if (qqqz == board.length) {
                    return true;
                }
            }
            if (board[i][2] == 'X') {
                qqqzz++;
                if (qqqzz == board.length) {
                    return true;
                }
            }
            if (board[i][3] == 'X') {
                qqqzzz++;
                if (qqqzzz == board.length) {
                    return true;
                }
            }
            if (board[i][4] == 'X') {
                oo++;
                if (oo == board.length) {
                    return true;
                }
            }
            System.out.println();
        }
        return false;
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



