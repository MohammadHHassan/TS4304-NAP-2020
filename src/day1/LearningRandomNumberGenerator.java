package day1;

public class LearningRandomNumberGenerator
{
	public static void main(String[] args)
	{
		//int randomNumber = min + (int)(Math.random()*((max-min)+1));
		int randomNumber = 1 + (int)(Math.random()*((10-1)+1));
		
		System.out.println("Random number generated = " + randomNumber);
	}
}
