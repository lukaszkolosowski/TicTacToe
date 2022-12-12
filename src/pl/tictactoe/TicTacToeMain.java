package pl.tictactoe;

import pl.tictactoe.checkgameresult.CheckGameResult;
import pl.tictactoe.gameparameters.GameSymbols;
import pl.tictactoe.makeamove.IsThisFieldOnTheBoardEmpty;
import pl.tictactoe.printboard.PrintActualBoard;

public class TicTacToeMain {

    public static void main(String[] args) {

        System.out.println("Welcome in game.");

        CheckGameResult checkGameResult = new CheckGameResult();
        PrintActualBoard printActualBoard = new PrintActualBoard();
        IsThisFieldOnTheBoardEmpty isThisFieldOnTheBoardEmpty = new IsThisFieldOnTheBoardEmpty();
        GameSymbols gameSymbols = new GameSymbols();

        int size = checkGameResult.getBoardSize();
        char currentSymbol = gameSymbols.getSymbolX();
        char[][] board = new char[size][size];

        boolean whetherToContinue = true;
        int movementCounter = 0;
        while (whetherToContinue && movementCounter < size * size) {
            printActualBoard.printBoard(board);
            boolean correctMove = isThisFieldOnTheBoardEmpty.makeAMove(board, currentSymbol);
            if (correctMove) {
                movementCounter++;
                boolean winRows = checkGameResult.checkTheResultInTheRows(board, currentSymbol);
                boolean winColumn = checkGameResult.checkTheResultInTheColumn(board, currentSymbol);
                boolean winDiagonally = checkGameResult.checkTheResultInTheDiagonal1(board, currentSymbol);
                boolean winDiagonally2 = checkGameResult.checkTheResultInTheDiagonal2(board, currentSymbol);
                if (winRows || winColumn || winDiagonally || winDiagonally2) {
                    printActualBoard.printBoard(board);
                    System.out.println("Congratulations " + currentSymbol + " win!");
                    whetherToContinue = false;
                }
                currentSymbol = currentSymbol == gameSymbols.getSymbolX() ? gameSymbols.getSymbolO() : gameSymbols.getSymbolX();
            }
        }
    }
}
