package day5.computerapplication;

public class Smartphone extends Portable
{
	double cameraMegapixel;
	boolean display;

	public Smartphone(String operatingSystem, double cameraMegapixel)
	{
		super(operatingSystem);
		switchOffDisplay();
		this.cameraMegapixel = cameraMegapixel;
	}
	
	public void switchOnDisplay()
	{
		display = true;
	}
	
	public void switchOffDisplay()
	{
		display = false;
	}
}
