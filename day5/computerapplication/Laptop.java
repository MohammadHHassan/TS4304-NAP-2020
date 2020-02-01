package day5.computerapplication;

public class Laptop extends Portable
{
	String graphicCard;
	boolean sleeping;

	public Laptop(String operatingSystem, String graphicCard)
	{
		super(operatingSystem);
		sleep();
		this.graphicCard = graphicCard;
	}
	
	public void sleep()
	{
		sleeping = true;
	}
	
	public void wakeUp()
	{
		sleeping = false;
	}
}
