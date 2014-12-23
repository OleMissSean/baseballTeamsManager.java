//Sean Staz
//CSci 112
//Java II

public class team 
{
	player[] player = new player[10];
	int counter = 0;
	String teamName;
	
	public team()
	{
		teamName = "";
	}
		
	public team(String tName)
	{
		setTeamName(tName);
	}
	
	private void setTeamName(String tName) 
	{
		teamName = tName;
	}
	
	public void addPlayer (String n, double ba, String p)
	{
		player[counter] =  new player(n, ba, p);
		counter++;
	}
	
	public void sortTeam()
	{
		int index, minIndex;
		double minValue;
		player temp = new player();
		
		for (int startScan = 0; startScan < (counter - 1); startScan++)
		{
			minIndex = startScan;
			minValue = player[startScan].getBattingAverage();
			
			for(index = startScan + 1; index < counter; index++)
			{
				if (player[index].getBattingAverage() < minValue)
				{
					minValue = player[index].getBattingAverage();
					minIndex = index;
				}
			}	
			
			temp = player[minIndex];
			player[minIndex] = player[startScan];
			player[startScan] = temp;
		}
	}
			
	public void printAll()
	{
		System.out.println("Team: " + teamName);
		for(int i = 0; i < counter; i++)
		{
			System.out.println("Player: " + player[i]);
		}
	}
	
	public void high()
	{
		boolean found = false;
		System.out.println("Players with batting avg over .300 are: ");

		for (int i = 0; i < counter; i++)
		{		
			if (player[i].getBattingAverage() >= .300)
			{
				System.out.println(player[i].getPlayerName());
				found = true;				
			}
		}
			System.out.println("");
			
			if (!found)
			{
				System.out.println("There are no players with a batting average over .300");
				System.out.println("");
			}
	}
		
	
	public void teamAvg()
	{
		double avg = .000;
		double sum = .000;
		double totalAvg = .000;
		
		for(int i = 0; i < counter; i++)
		{
			avg = player[i].getBattingAverage();
			sum = avg + sum;
		}
		
		totalAvg = sum / counter;
		
		System.out.println("The teams average is " + totalAvg);
		System.out.println("");
	}
}
