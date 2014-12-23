/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  6/28/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 
import java.util.ArrayList;
import java.util.Scanner;

public class driver 
{
	public static void main (String[] args)
	{	
		Scanner keyboard = new Scanner(System.in);
		String name;
		
		System.out.println("Please enter your name.");
		name = keyboard.nextLine();
		System.out.println("Welcome, Commisioner. A list of the legue's team's batting averages proceeds:");
		System.out.println("");
		
		ArrayList<team> team = new ArrayList<team>();
		
		team team1 = new team("The Sea Men");
			team.add(team1);
			team1.addPlayer("Joey", .500, "SS");
			team1.addPlayer("Roger", .450, "FB");
			team1.addPlayer("Cobain",.200, "SB");
			team1.addPlayer("Grohl", .600, "TB");
			team1.addPlayer("Krist", .550, "P");
			team1.sortTeam();
			System.out.println("");
		
		team team2 = new team("Dreadnoughts");
			team.add(team2);
			team2.addPlayer("Taylor", .300, "SS");
			team2.addPlayer("Wilson", .150, "FB");
			team2.addPlayer("Sean",.750, "SB");
			team2.addPlayer("Staz", .600, "TB");
			team2.addPlayer("Brent", .550, "P");
			team2.sortTeam();
			System.out.println("");
		
		team team3 = new team("Spartans");
			team.add(team3);
			team3.addPlayer("Craig", .100, "SS");
			team3.addPlayer("Jim", .150, "FB");
			team3.addPlayer("James",.050, "SB");
			team3.addPlayer("Mick", .200, "TB");
			team3.addPlayer("Paul", .250, "P");
			team3.sortTeam();
			System.out.println("");
			
		for (int i=0; i <= 2; i++)
		{
			team.get(i).printAll();
			System.out.println();			
		}
		
		team1.high();
		team2.high();
		team3.high();
		
		team1.teamAvg();
		team2.teamAvg();
		team3.teamAvg();
	}
}
