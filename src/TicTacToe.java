import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome in game. Enter board size.");

        int size = new Scanner(System.in).nextInt();
        char currentSymbol = 'X';
        char[][] board = new char[size][size];

        boolean whetherToContinue = true;
        int movementCounter = 0;
        while (whetherToContinue && movementCounter < size * size) {
            TicTacToe.printBoard(board);
            boolean correctMove = makeAMove(board, currentSymbol);
            if (correctMove) {
                movementCounter++;
                boolean winRows = checkTheRows(board, currentSymbol);
                boolean winColumn = checkTheColumn(board, currentSymbol);
                boolean winDiagonally = checkTheDiagonal(board, currentSymbol);
                boolean winDiagonally2 = checkTheDiagonal2(board, currentSymbol);
                if (winRows || winColumn || winDiagonally || winDiagonally2) {
                    TicTacToe.printBoard(board);
                    System.out.println("Congratulations " + currentSymbol + " win!");
                    whetherToContinue = false;
                }
                currentSymbol = currentSymbol == 'X' ? 'O' : 'X';
            }
        }
    }

    public static boolean checkTheRows(char[][] board, char symbol) {
        int size = board.length;
        for (int row = 0; row < size; row++) {
            boolean win = true;
            for (int column = 0; column < size; column++) {
                if (board[row][column] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkTheColumn(char[][] board, char symbol) {
        int size = board.length;
        for (int column = 0; column < size; column++) {
            boolean win = true;
            for (int row = 0; row < size; row++) {
                if (board[row][column] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkTheDiagonal(char[][] board, char symbol) {
        int size = board.length;
        for (int i = 0; i < size; i++) {
            if (board[i][i] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkTheDiagonal2(char[][] board, char symbol) {
        int size = board.length;
        for (int i = 0; i < size; i++) {
            if (board[i][(size - 1) - i] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean makeAMove(char[][] board, char symbol) {
        System.out.println(symbol + " your move");
        System.out.println("Enter the row index");
        int row = new Scanner(System.in).nextInt();
        System.out.println("Enter the column index");
        int column = new Scanner(System.in).nextInt();
        boolean correctMove = board[row][column] == 0;
        if (!correctMove) {
            System.out.println("Incorrect move!");
            return false;
        }
        board[row][column] = symbol;
        return true;
    }

    public static void printBoard(char[][] board) {
        int size = board.length;
        // column headers
        System.out.print("\t");

        // loop printing column headers
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int row = 0; row < size; row++) {
            System.out.print(row + ":\t");
            for (int column = 0; column < size; column++) {
                System.out.print(board[row][column] + "\t");
            }
            System.out.println();
        }
    }
}