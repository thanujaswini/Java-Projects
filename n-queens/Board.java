package board;

public class Board {
    public int size;
    public char board[][];

    public Board(int size) {
        this.size = size;
        this.board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.board[i][j] = '-';
            }
        }
    }
    

}
