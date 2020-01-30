package day4.carapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Wheels wheels1 = new Wheels();
		wheels1.brand = "Bridgestone";
		wheels1.size = 20;
		
		Wheels wheels2 = new Wheels();
		wheels2.brand = "LingLong";
		wheels2.size = 17;
		
		Car car1 = new Car();
		car1.brand = "Toyota";
		car1.model = "Super Kijang";
		car1.colour = "White";
		car1.engineSize = 3.6;
		car1.numberOfDoors = 2;
		car1.wheels = wheels1;
		
		
		//System.out.println(car1);
		System.out.println("Car 1: ");
		printText(car1);
		System.out.println("\nCar 1 wheels = " + car1.wheels);
		System.out.println("\nCurrent speed = " + car1.currentSpeed);
		car1.pressAccelerator();
		car1.pressAccelerator();
		car1.pressAccelerator();
		System.out.println("After acceleration, speed = " + car1.currentSpeed);
		car1.pressBrake();
		System.out.println("After braking, speed = " + car1.currentSpeed);
		
		Car car2 = new Car();
		car2.brand = "BMW";
		car2.model = "M2";
		car2.colour = "Yellow";
		car2.engineSize = 6.5;
		car2.numberOfDoors = 3;
		car2.wheels = wheels2;
		
		System.out.println("\n\nCar 2: ");
		printText(car2);
		System.out.println("\nCar 2 wheels = " + car2.wheels);
	}
	
	public static void printText(Car car)
	{
		System.out.println("Brand = " + car.brand);
		System.out.println("Model = " + car.model);
		System.out.println("Colour = " + car.colour);
		System.out.println("Engine size = " + car.engineSize);
		System.out.println("Number of doors = " + car.numberOfDoors);
	}
}







