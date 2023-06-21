package B;
import java.util.Scanner;
import java.util.Random;
public class BSRandom {
    public static void main(String [] args) {
        Random rd = new Random(System.currentTimeMillis());
        Scanner inp = new Scanner(System.in);
        System.out.println("You have 10x10 board \n"+
                "Vertical numbers are called 'First Index'" + "\n"+
                "Horizontal numbers are called 'Second Index" + "\n\n"+
                "Please choose an ship to place" + "\n" +
                "1-Destroyer = 2 squares" + "\n" +
                "2-Submarine = 3 squares" + "\n" +
                "3-Cruiser = 3 squares" + "\n" +
                "4-Battleship = 4 squares" + "\n" +
                "5-Carrier = 5 squares"+"\n");
        char[] length = {0,2,3,3,4,5};
        char[][] board = new char[10][10];
        char[][] empty= new char[10][10];
        for(int i = 0 ; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                empty[i][j] = '#';

            }
        }

        char[][] ingame = new char[10][10];
        for(int i = 0; i < 10 ; i++){
            for(int j = 0; j < 10 ; j++){
                ingame[i][j] = '#';
            }
        }
        for(int i = 0 ; i < 10 ; i++){
            for(int j = 0 ; j< 10 ; j++){
                board[i][j] = '#';
            }
        }
        int ship=1;
        do {
            int direction = rd.nextInt(2) + 1; //1 = vertical      2 = horizontal

            int index1 = rd.nextInt(10);
            int index2 = rd.nextInt(10);
            boolean flag = true;
            if (direction == 1) {
                for (int i = index1; i < index1 + length[ship]; i++) {
                    if (index1 + length[ship] > 10) {
                        flag = false;
                        break;
                    }

                    else if (board[i][index2] != '#') {
                        flag = false;
                        break;
                    }
                }
            }
            if (direction == 2) {
                for (int i = index2; i < index2 + length[ship]; i++) {
                    if (index2 + length[ship] > 10) {
                        flag = false;
                        break;
                    }
                    else if (board[index1][i] != '#') {
                        flag = false;
                        break;
                    }
                }

            }
            if (flag) {
                ship += 1;
                boardf(index1,index2,ship,direction,board);
            }
        }while(ship != 6);
        System.out.print("   ");
        for(int i = 0 ; i < 10 ; i++){

            System.out.print(i+" ");
        }
        System.out.print("\n");
        System.out.print("   ");
        for(int i = 0 ; i < 10 ; i++){
            System.out.print("| ");
        }
        System.out.print("\n");
        for(int i = 0 ; i < empty.length ; i ++ ) {
            System.out.print(i + "--");

            for(int j = 0 ; j < empty.length ; j++){
                System.out.print(empty[i][j]+ " ");

            }
            System.out.print("\n");
        }
        while(true) {
            System.out.print("Enter the first index that you want to shoot =");
            int index1 = inp.nextInt();
            if(index1 < 0 || index1 > 9) {
                System.out.println("Please enter an proper index");
                continue;
            }
            System.out.print("Enter the second index that you want to shoot = ");
            int index2 = inp.nextInt();
            if(index2 < 0 || index2 > 9) {
                System.out.println("Please enter a proper index.");
                continue;
            }

            shooting(index1,index2,board,ingame);
        }








    }



    public static char[][] boardf(int index1, int index2, int ship , int direction,char[][] board){
        char sym = 0;
        int length = 0;
        switch(ship) {
            case 1:
                sym = 'D';
                length += 2;
                break;
            case 2:
                sym = 'S';
                length += 3;
                break;
            case 3:
                sym = 'c';
                length += 3;
                break;
            case 4:
                sym = 'B';
                length += 4;
                break;
            case 5:
                sym = 'C';
                length += 5;
                break;
        }
        if(direction == 1 ) {
            for(int i = index1 ; i < index1+length ; i++) {
                board[i][index2] = sym;
            }
        }
        else if (direction == 2){
            for(int i = index2; i < index2+length ; i++) {
                board[index1][i] = sym;
            }

        }


            return board;
        }





        public static void shooting(int index1, int index2,char[][] board,char[][] ingame){

            switch(board[index1][index2]){
                case 'D':
                    System.out.println("You shot Destroyer");
                    ingame[index1][index2] = 'D';
                    break;
                case 'S':
                    System.out.println("You shot Submarine");
                    ingame[index1][index2] = 'S';
                    break;
                case 'c':
                    System.out.println("You shot Cruiser");
                    ingame[index1][index2] = 'c';
                    break;
                case 'B':
                    System.out.println("You shot Battleship");
                    ingame[index1][index2] = 'B';
                    break;
                case 'C':
                    System.out.println("You shot Carrier");
                    ingame[index1][index2] = 'C';
                    break;
                default:
                    System.out.println("You shot nothing.");
                    ingame[index1][index2] = 'x';
                    break;
            }
            System.out.print("   ");
            for(int i = 0 ; i < 10 ; i++){

                System.out.print(i+" ");
            }
            System.out.print("\n");
            System.out.print("   ");
            for(int i = 0 ; i < 10 ; i++){
                System.out.print("| ");
            }
            System.out.print("\n");
            for(int i = 0 ; i < ingame.length ; i ++ ) {
                System.out.print(i + "--");

                for(int j = 0 ; j < ingame.length ; j++){
                    System.out.print(ingame[i][j]+ " ");

                }
                System.out.print("\n");
            }




        }
    }

    //olduğu bu kadar mk dahası olmaz benden
    //üst üste gelme sorunu var

