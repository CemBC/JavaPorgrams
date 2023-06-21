public class Warrior extends Character{
    private int energy;
    public Warrior() {
        super();
        this.energy = 20;
    }

    public Warrior(String name , double hitPoint , String gender) {
        super(name,hitPoint,gender);
        this.energy = 20;
    }


    public void regeneratePower() {
        System.out.println("Resting...");
        rest();
        System.out.println("Your energy after rest = " + getEnergy());
    }
    public double calculateDamage(){
        return getHitPoint()*1.2d;
    }

    public void attack() {
        if(energy< 10) {
            System.out.println("Can't attack , get some rest.");
        }else{
            energy -= 10;
            System.out.println("Attacking... Damage is = " + calculateDamage() );
            System.out.println("Remaining energy = " + getEnergy());
        }
    }

    private void rest() {
        energy += 20;
        if(energy > 100) {
            energy = 100;
        }
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Class = Warrior" );
        System.out.println("Using energy , Remaining energy = " + getEnergy());
    }

    public int getEnergy() { return energy;}
}
