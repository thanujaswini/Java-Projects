package player;
public class Player {
    private String name;
    private int age;
    private char symbol;
    private long number;
    private String email;
    private String address;
    

    public  void setPlayerDetails(String name,int age,char symbol,long number,String email,String address){
        this.name=name;
        this.age=age;
        this.symbol=symbol;
        this.number=number;
        this.email=email;
        this.address=address;
    }
    public void setSymbol(char symbol){
        this.symbol=symbol;
    }
    public void setPlayerNameAndAge(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setPlayerNameAndSymbol(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }
    public void printNameAndSymbol(){
        System.out.println("-------------------");
        System.out.println("name of the player is "+this.name);
        System.out.println("symbol of the player is "+this.symbol);
    }
    public String getPlayerName(){
        return this.name;
    }
    public char getPlayerSymbol(){
        return this.symbol;
    }

   
    public void printDetails(){
        System.out.println("-------------------");
        System.out.println("name of the player is "+this.name);
        System.out.println("age of the player is "+this.age);
        System.out.println("symbol of the player is "+this.symbol);
        System.out.println("email of player"+this.email);
        System.out.println("contac number of player is:"+this.number);
        System.out.println("address of player:"+this.address);




    }

}
