public class Character {
    private String name;
    private double hitPoint;
    private String gender;



    public Character() {
        this.name = "No name";
        this.hitPoint = 0;
        this.gender = "Undefined";
    }

    public Character(String name , double hitpoint , String gender) {
        this.gender = gender;
        this.hitPoint = hitpoint;
        this.name = name;

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(double hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void printInfo() {
        System.out.println("Name = " + getName() + "\nAttack Damage = " + calculateDamage() + "\nGender = " + getGender());

    }

    public void regeneratePower() {
        System.out.println("Regenerating Power...");
    }

    public double calculateDamage() {
        return hitPoint;
    }

    public void attack() {
        System.out.println("Attacking... Damage is = " + calculateDamage());
    }
}
