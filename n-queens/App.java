import board.Board;
import game.Nqueen;
public class App {
    public static void main(String[] args) throws Exception {
        Board b=new Board(4);
        Nqueen game=new Nqueen(b);
        game.play(); 
    }
}
