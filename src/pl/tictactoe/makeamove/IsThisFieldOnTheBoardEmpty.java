package pl.tictactoe.makeamove;

import java.util.Scanner;

public class IsThisFieldOnTheBoardEmpty implements ControlOfBlankSpacesOnTheBoard {

    private int row;
    private int column;

    public IsThisFieldOnTheBoardEmpty(){

    }

    public IsThisFieldOnTheBoardEmpty(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean makeAMove(char[][] board, char symbol) {
        System.out.println(symbol + " your move");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the row index");
        row = scanner.nextInt();
        System.out.println("Enter the column index");
        column = scanner.nextInt();

        boolean correctMove = board[row][column] == 0;
        if (!correctMove) {
            System.out.println("Incorrect move!");
            return false;
        }
        board[row][column] = symbol;
        return true;
    }
}
