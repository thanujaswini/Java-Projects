package game;
import board.Board;
import player.Player;
public class Game {
    Board board;
    Player player;
    public Game(Board board,Player player){
        this.board=board;
        this.player=player;
    }
    public void play(){
        solveSudoku(0,0);
    }
    public boolean solveSudoku(int row, int col) {
        // Base case: If we reach the end of the board, the puzzle is solved
        if (row == board.size) {
            System.out.println("Sudoku solved!!!!!!!");
            board.printBoardConfig();
            return true;
        }
    
        // Calculate the next row and column
        int nrow = 0;
        int ncol = 0;
        if (col == board.size - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }
    
        // Skip filled cells
        if (board.matrix[row][col] != 0) {
            return solveSudoku(nrow, ncol);
        } else {
            // Try placing numbers 1-9 in the current cell
            for (int i = 1; i <= 9; i++) {
                if (vaildNumber(board.matrix, row, col, i)) {
                    board.matrix[row][col] = i;
                    
                    // Proceed with next cell
                    if (solveSudoku(nrow, ncol)) {
                        return true;
                    }
                    
                    // Backtrack if needed
                    board.matrix[row][col] = 0;
                }
            }
        }
        return false; // No valid number found, need to backtrack
    }
    
    private boolean vaildNumber(int matrix[][],int row,int col,int val){
        for(int i=0;i<matrix.length;i++){
            if(matrix[row][i]==val){
                return false;
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col]==val){
                return false;
            }
        }
        int tempRow=row/3*3;
        int tempCol=col/3*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[tempRow+i][tempCol+j]==val){
                    return false;
                }
            }
        }


        return true;
    }

}
