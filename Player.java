//Sean Staz
//CSci 112
//Java II

public class player 
{
	String name;
	double battingAverage;
	String position;
	
	public player()
	{
		name = "";
		battingAverage = .000;
		position = "";
	}
	
	public player(String n, double ba, String p)
	{
		setName(n);
		setBattingAverage(ba);
		setPosition(p);
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setBattingAverage(double ba)
	{
		battingAverage = ba;
	}
	
	public void setPosition(String p)
	{
		position = p;
	}
	
	public String getPlayerName()
	{
		return name;
	}
	
	public double getBattingAverage()
	{
		return battingAverage;
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public String toString()
	{
		String str = "[Name: " + name + "]" + " [Position: " + position + "]" + " [Batting average: " + battingAverage + "]";	
		
		return str;
	}
}
