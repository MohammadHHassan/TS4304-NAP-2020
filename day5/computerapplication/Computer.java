package day5.computerapplication;

public class Computer
{
	String operatingSystem;
	boolean powerState;
	
	public Computer(String operatingSystem)
	{
		this.operatingSystem = operatingSystem;
		shutDown();
	}
	
	public void shutDown()
	{
		powerState = false;
	}
	
	public void bootUp()
	{
		powerState = true;
	}
}



