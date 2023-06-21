/*
* Author: Ilker Korkmaz
*/

public class SoccerPlayer{
    private String name;  // non-static data members (instance variables)
    private int shirtNumber;
	
    private static int numberOfPlayers = 0;  // static data members are shared by the class, not owned by an instance

    public void setName(String myName){ // setName is a mutator method
        name=myName;
    }
    public void setShirtNumber(int no){
        if(no<1 || no>999) // argument validation
            no=12;

        shirtNumber=no;
    }
    public String getName() { // getName is an accessor method
        return name;
    }
    public int getShirtNumber() {
        return shirtNumber;
    }
    public void print() { // displays the information of the object
        System.out.println("The player information:");
        System.out.println( "Name         : " + name);
        System.out.println( "Shirt Number : " + shirtNumber);
    }
    public static int getNumberOfPlayers() {
        return numberOfPlayers;
    }
    private void incrementNumberOfPlayers(){  // utility method
        numberOfPlayers++;
    }
    public SoccerPlayer() { // constructor with no parameters
        setName(null);
        setShirtNumber(12);
        incrementNumberOfPlayers();
    }
    public SoccerPlayer(String myName, int myNo) { // constructor with 2 parameters
        setName(myName);
        setShirtNumber(myNo);
        incrementNumberOfPlayers();
    }
    public SoccerPlayer(SoccerPlayer parameterToCopy){ // constructor with one parameter
        setName(parameterToCopy.getName());
        setShirtNumber(parameterToCopy.getShirtNumber());
        incrementNumberOfPlayers();
    }
} // end of class SoccerPlayer