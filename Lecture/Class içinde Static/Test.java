/*
* Author: Ilker Korkmaz
*/

public class Test {
    public static void main(String[] args) {
        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers()); // public static members can be called using the class name
        System.out.println();

        SoccerPlayer sRef1 = new SoccerPlayer();
        sRef1.print();

        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers());
        System.out.println();

        SoccerPlayer sRef2 = new SoccerPlayer("Messi", 10);
        sRef2.print();

        System.out.println("number of players: " + sRef2.getNumberOfPlayers());
        System.out.println();

        SoccerPlayer sRef3 = new SoccerPlayer("Ronaldo", 11);
        sRef3.print();

        System.out.println("number of players: " + sRef1.getNumberOfPlayers());
        System.out.println();

        SoccerPlayer sRef4 = new SoccerPlayer(sRef2); //copy constructor is called
        sRef4.print();

        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers());
        System.out.println();

        sRef1=sRef2; // What happens here?
		/*
		After the assignment above is executed, both sRef1 and sRef2 will refer to the same object in memory. 
		The object which was previously referred by sRef1 will not be accessible in this program anymore; therefore, the memory area previously allocated for that object will be a garbage part in memory. 
		Java Garbage Collector will collect the garbage and will deallocate the corresponding memory area. However, there is no predetermined time for Java Garbage Collector to do its job.
		*/
        sRef1.print();
        sRef2.print();
        sRef3.print();
        sRef4.print();

        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers());
        System.out.println();

        sRef3=sRef2; // What happens here?
		/* 
		After the assignment above is executed, the information to be printed by sRef2 and sRef3 will be the same.
        */
		sRef1.print();
        sRef2.print();
        sRef3.print();
        sRef4.print();

        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers());
        System.out.println();

        SoccerPlayer sRef5 = sRef3; // // What happens here?
		/*
		There is no new object instantiation in the statement above.
		After the assignment above is executed, the variable sRef5 will refer to the object referred by the variable sRef3.
		*/
        sRef5.print();

        System.out.println("number of players: " + SoccerPlayer.getNumberOfPlayers());
        System.out.println();
    } // end of main
} // end of class Test