package game;
import board.Board;

public class Nqueen {
    Board q;
    public Nqueen(Board q){
        this.q=q;

    }
    public void play() {
        System.out.println("Board size: " + q.size);
        if (q.size < 4) {
            System.out.println("no configuration possible");
            return;
        }
        nqueen_Helper(q.board, 0);
    }
    
    private void nqueen_Helper(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafeQueen(board,row,col)==true){
                board[row][col]='Q';
                nqueen_Helper(board, row+1);
                board[row][col]='-';
            }
        }
    }
    private boolean isSafeQueen(char board[][], int row, int col) {
        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Check same column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        return true;
    }
    
    private void printBoard(char board[][]) {
        System.out.println("Solution for " + board.length + "-Queens:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    


}
