package pl.tictactoe.printboard;

import pl.tictactoe.checkgameresult.CheckGameResult;

public class PrintActualBoard {

    CheckGameResult checkGameResult = new CheckGameResult();
    public void printBoard(char[][] board) {
        int size = checkGameResult.getBoardSize();
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
