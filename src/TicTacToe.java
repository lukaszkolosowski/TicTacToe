import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome in game. Enter board size.");

        int size = new Scanner(System.in).nextInt();
        char currentSymbol = 'X';
        char[][] board = new char[size][size];

        while (true) {
            TicTacToe.printBoard(board);
            boolean correctMove = makeAMove(board, currentSymbol);
            if (!correctMove) continue;
            currentSymbol = currentSymbol == 'X' ? 'O' : 'X';
        }
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
        // clolumn headers
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