package day5.computerapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Desktop desktop1 = new Desktop("Windows 10");
		System.out.println("Desktop 1's OS is " + desktop1.operatingSystem);
		System.out.println("Desktop 1's power state = " + desktop1.powerState);
		desktop1.bootUp();
		System.out.println("Desktop 1's new power state = " + desktop1.powerState);
		
		Smartphone smartphone1 = new Smartphone("iOS", 12);
		smartphone1.chargeBattery(80);
		System.out.println("\n\nSmartphone 1's OS is " + smartphone1.operatingSystem);
		System.out.println("Smartphone 1 has " + smartphone1.cameraMegapixel + " megapixel camera");
		System.out.println("Battery = " + smartphone1.getBatteryCapacity() + "%");
		
	}
}
