package day4.carapplication;

public class Car
{
	String brand;				// Attributes
	String model;
	String colour;
	int numberOfDoors;
	double engineSize;
	double currentSpeed=0;
	
	Wheels wheels;
	
	public void pressAccelerator()		//Behavior
	{
		currentSpeed += 10;			// currentSpeed = currentSpeed + 10
	}
	
	public void pressBrake()
	{
		currentSpeed -= 5;
		
		if(currentSpeed<0)
		{
			currentSpeed = 0;
		}
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", colour=" + colour + ", numberOfDoors=" + numberOfDoors
				+ ", engineSize=" + engineSize + "]";
	}
}
