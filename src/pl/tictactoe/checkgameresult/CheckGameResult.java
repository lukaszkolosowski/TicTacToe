package pl.tictactoe.checkgameresult;

public class CheckGameResult extends ControlOfGameResults {

    private int boardSize = 3;
    private boolean win = true;

    public CheckGameResult() {

    }

    public int getBoardSize() {
        return boardSize;
    }

    @Override
    public boolean checkTheResultInTheRows(char[][] board, char symbol) {
        for (int row = 0; row < boardSize; row++) {
            for (int column = 0; column < boardSize; column++) {
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

    @Override
    public boolean checkTheResultInTheColumn(char[][] board, char symbol) {
        for (int column = 0; column < boardSize; column++) {
            for (int row = 0; row < boardSize; row++) {
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

    @Override
    public boolean checkTheResultInTheDiagonal1(char[][] board, char symbol){
        for (int i = 0; i < boardSize; i++) {
            if (board[i][i] != symbol) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkTheResultInTheDiagonal2(char[][] board, char symbol){
        for (int i = 0; i < boardSize; i++) {
            if (board[i][(boardSize - 1) - i] != symbol) {
                return false;
            }
        }
        return true;
    }

}
