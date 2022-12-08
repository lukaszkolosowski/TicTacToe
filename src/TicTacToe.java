public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome in game. Enter board size.");

        int size = 3;
        char[][] board = new char [size][size];
//                {
//                        {'O', 'X', 'X'},
//                        {'O', 'X', ' '},
//                        {' ', 'O', 'O'}
//                };

        TicTacToe.printBoard(board);

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