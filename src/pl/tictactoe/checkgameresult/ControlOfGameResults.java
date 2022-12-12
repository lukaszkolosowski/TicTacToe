package pl.tictactoe.checkgameresult;

public abstract class ControlOfGameResults {

    public abstract boolean checkTheResultInTheRows(char[][] board, char symbol);

    public abstract boolean checkTheResultInTheColumn(char[][] board, char symbol);

    public abstract boolean checkTheResultInTheDiagonal1(char[][] board, char symbol);

    public abstract boolean checkTheResultInTheDiagonal2(char[][] board, char symbol);
}
