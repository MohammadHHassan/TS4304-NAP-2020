package day6.improvedshapeapplication;

public abstract class Shape
{
	String colour;
	
	public Shape(String colour)
	{
		this.colour = colour;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public void editColour(String newColour)
	{
		this.colour = newColour;
	}
}
