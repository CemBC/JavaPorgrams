public class Mage extends Character{
    private int mana;

    public Mage() {
        super();
        this.mana = 10;
    }

    public Mage(String name , double hitPoint , String gender ) {
        super(name , hitPoint , gender);
        mana = 10;
    }

    private void drinkPotion() {
        mana+= 5;
        if(mana > 100) {
            mana = 100;
        }
    }

    public void regeneratePower() {
        System.out.println("Drinking potion");
        drinkPotion();
        System.out.println("Your mana now = " +getMana());
    }
    public void attack() {
        if(mana < 5) {
            System.out.println("Can't attack , drink a potion..");
        }else {
            mana -= 5 ;
            System.out.println("Attacking... Damage is = " + calculateDamage());
            System.out.println("Current mana = " + getMana());
        }
    }
    public double calculateDamage() { return getHitPoint()*0.8d;}

    public int getMana() { return mana;}


    public void printInfo() {
        super.printInfo();
        System.out.println("Class = Mage");
        System.out.println("Using mana , Remaining mana = " + getMana());
    }
}
