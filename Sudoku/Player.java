package player;

public class Player {
    String name;
    String email;
     
    public void setPlayerdetails(String name,String email){
        this.name=name;
        this.email=email;
    }
    public void getPlayerdetails(){
        System.out.println("name of the player is "+this.name);
        System.out.println("email of player is "+this.email);
    }

}
