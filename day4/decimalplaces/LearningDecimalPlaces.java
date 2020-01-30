package day4.decimalplaces;

import java.text.DecimalFormat;

public class LearningDecimalPlaces
{
	public static void main(String[] args)
	{
		double pi = 3.14159;
		
		System.out.println("Pi = " + pi);
		System.out.printf("Pi in 2 d.p = %.2f", pi);
		
		DecimalFormat a = new DecimalFormat("#.##");
		System.out.println("\nPi in 2 d.p = " + a.format(pi));
		
		System.out.println("2.55555 in 2 d.p = " + a.format(2.55555));
	}
}
