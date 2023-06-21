import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Character mage1 = new Mage("Jaina Proudmoore", 45.7, "Female");
        Character warrior1 = new Warrior("Garrosh HellScream", 60, "Male");
        ArrayList<Character> list1 = new ArrayList<Character>();
        list1.add(mage1);
        list1.add(warrior1);

        Character mage2 = new Mage("Ras Frostwhisper", 30.5, "Male");
        Character warrior2 = new Warrior("Uther Lightbringer", 50, "Male");
        ArrayList<Character> list2 = new ArrayList<Character>();
        list2.add(mage2);
        list2.add(warrior2);

        Player player1 = new Player("Cem", "123ad", list1);
        Player player2 = new Player("Beyazıt" , "bf3425" , list2);

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);

        for(Player a : players){
            a.printPlayerInfo();
            for(Character b : a.getCharacters()) {
                b.attack();
                b.regeneratePower();
            }
            a.printPlayerInfo();
            System.out.println("/////////");
        }
        double maxDamage = Double.MIN_VALUE;
        String maxDamageName = "";
        for(Player c : players) {
            if(c.totalDamage() > maxDamage) {
                maxDamage = c.totalDamage();
                maxDamageName = c.getName();
            }
        }
        System.out.println("A Player who has maximum total damage = " + maxDamageName + "\nMaximum Damage = " + maxDamage);



    }
}
