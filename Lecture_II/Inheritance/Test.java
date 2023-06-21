package Lecture_II.Inheritance;



public class Test {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.display();
        Truck Kamaz = new Truck("AB-20C",15000,false);
        Truck Yamaha = new Truck();
        Kamaz.display();
        Yamaha.display();
    }
}
