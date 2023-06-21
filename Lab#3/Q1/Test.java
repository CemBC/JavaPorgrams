public class Test {
    public static void main(String[] args) {
        final int size = 3;
        Pyramid[] list = new Pyramid[size];
        list[0] = new Pyramid();
        list[1] = new Pyramid("Black", 4.3 , 2.2 , 4);
        list[2] = new Pyramid("Yellow" , 3.1 , 6.9 , 1);
        for(Pyramid p : list) {
            p.showInfo();
            System.out.println("----------");
        }
    }
}
