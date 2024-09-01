
import board.Board;
import player.Player;
import game.Game;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner(System.in);
         Board b=new Board(3, '-');
         b.printBoardConfig();
         Player p1=new Player();
         System.out.println("enter player 1 details:");
         String n1=scn.nextLine();
         char s1=scn.next().charAt(0);
         p1.setPlayerNameAndSymbol(n1,s1);
         p1.printNameAndSymbol();
         Player p2=new Player();
         scn.nextLine(); 
         System.out.println("enter player 2 details:");
         String n2=scn.nextLine();
         char s2=scn.next().charAt(0);
         if(s2==s1){
            System.out.println("please take another symobol:");
            s2=scn.next().charAt(0);
         }
         p2.setPlayerNameAndSymbol(n2,s2);
         p2.printNameAndSymbol();
         Game g=new Game(new Player[] {p1,p2}, b);
         g.play();
         
    }
}
