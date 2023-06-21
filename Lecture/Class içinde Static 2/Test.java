/*
* Author: Ilker Korkmaz
*/

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("The number of Boxes available in memory is: " + Box.getNumberOfBoxes());
        System.out.println();

        Box ref1 = new Box();  // constructor with no parameters

        System.out.print("Now, the number of boxes is: ");
        System.out.println(Box.getNumberOfBoxes());
        System.out.println();

        Box ref2 = new Box("Yellow", 5.0); // constructor with parameters

        System.out.print("Now, the number of boxes is: ");
        System.out.println(ref2.getNumberOfBoxes());
        System.out.println();

        System.out.println("Let's print the information of the boxes:");
        ref1.display();
        ref2.display();

        Box[] boxArrayRef;
        boxArrayRef = new Box[5]; // array object

        System.out.print("Now, the number of boxes is: ");
        System.out.println(Box.getNumberOfBoxes());
        System.out.println();

        String tempColor;
        double tempLength;

        for(int i=0; i<boxArrayRef.length; i++){ // for 5 times
            System.out.print("Enter the color for the " + (i+1) +  ". Box reference in the array: ");
            tempColor = input.next();
            System.out.print("Enter the length for the " + (i+1) + ". Box reference in the array: ");
            tempLength = input.nextDouble();

            boxArrayRef[i] = new Box(); // non-parameterized constructor
            boxArrayRef[i].setColor(tempColor);
            boxArrayRef[i].setLength(tempLength);
            boxArrayRef[i].calculateVolume();
        }

        Box[] anotherBoxArrayRef;
        anotherBoxArrayRef = new Box[3]; // another array object

        System.out.print("Now, the number of boxes is: ");
        System.out.println(Box.getNumberOfBoxes());
        System.out.println();

        for(int i=0; i<anotherBoxArrayRef.length; i++){ // for 3 times
            System.out.print("Enter the color for the " + (i+1) +  ". Box reference in the other array: ");
            tempColor = input.next();
            System.out.print("Enter the length for the " + (i+1) + ". Box reference in the other array: ");
            tempLength = input.nextDouble();

            anotherBoxArrayRef[i] = new Box(tempColor, tempLength); // parameterized constructor
        }

        System.out.println("Let's print the information of the contents of the first array:");
        for(Box item : boxArrayRef){
            item.display();
        }

        System.out.println("Let's print the information of the contents of the second array:");
        for(Box element : anotherBoxArrayRef)
            element.display();

        System.out.println("The info of each object (referred by the contents of the first array) with a volume value greater than 8:");
        for(Box content : boxArrayRef)
            if(content.getVolume()>8.0)
                content.display();

        System.out.println("The info of each object (referred by the contents of the second array) with a volume value greater than 8:");
        for(int i=0; i<anotherBoxArrayRef.length; i++)
            if(anotherBoxArrayRef[i].getVolume()>8.0)
                anotherBoxArrayRef[i].display();

        System.out.print("Now, the number of boxes is: ");
        System.out.println(Box.getNumberOfBoxes());
        System.out.println();
    }
}