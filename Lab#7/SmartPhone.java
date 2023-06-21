import java.util.Scanner;

public class SmartPhone {
    public static void displayMenu() {
        System.out.println("Smartphone App Menu");
        System.out.println("1. Weather App");
        System.out.println("2. GPS App");
        System.out.println("3. Radio App");
        System.out.println("4. Music Player App");
        System.out.println("0. Exit");
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        MusicPlayer mp = new MusicPlayer("Tarkan" , "10" , "Yolla" , 4 , 10);
        Radio radio = new Radio("QralFM" , "Programme" , 10);
        GPSApp gps = new GPSApp();
        WaetherApp weather = new WaetherApp();
        Phone phone = new Phone("Oppo A5" , 2020 , mp ,  radio , gps, weather);

        displayMenu();
        while(true) {
            int ch = 0;
            while(true) {
                try{
                    ch = inp.nextInt();
                    break;
                }catch(Exception e) {
                    System.out.println("Please enter an integer");
                    inp.nextLine();
                }
            }
            switch (ch) {
                case 1:
                    phone.getWeather().getCoordinates();
                    break;
                case 2:
                    phone.getGps().getCoordinates();
                    break;
                case 3:
                    phone.getRadio().next();
                    phone.getRadio().play();
                    phone.getRadio().prev();
                    phone.getRadio().stop();
                    break;
                case 4:
                    phone.getPlayer().play();
                    phone.getPlayer().next();
                    phone.getPlayer().prev();
                    phone.getPlayer().stop();
                    break;
            }

            if(ch == 0) {
                System.out.println("Exiting the system");
                break;
            }
        }
    }


}

