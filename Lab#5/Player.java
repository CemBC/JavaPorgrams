import java.util.ArrayList;

public class Player {
    private String name;
    private String password;

    private ArrayList<Character> characters;

    public Player() {
        this.name = "No name";
        this.password = "Not specified";
        characters = null;
    }

    public Player(String name , String password , ArrayList<Character> characters) {
        this.name = name;
        this.password = password;
        this.characters = characters;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Character> getCharacters() { return characters;}

    public void printPlayerInfo() {
        System.out.println("Name of the Player = " + getName() + "\nPassword  = " + getPassword().substring(0,password.length()-2)+"***");
        System.out.println("------------");
        for(Character a : characters) {
            a.printInfo();
            System.out.println("------------");
        }
    }

    public double totalDamage() {
        double td = 0;
        for(Character a : characters) {
            td+= a.calculateDamage();
        }
        return td;
    }
}
