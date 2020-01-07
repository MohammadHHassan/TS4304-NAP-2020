package day1;

import java.util.Scanner;

/* Create a random number generator
 * in which the maximum and minimum
 * range values are entered by the user.
 * Print out the randomly generated value.
 */

public class Exercise4
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the maximum range value: ");
		int max = scanner.nextInt();
		
		System.out.println("Please enter the minimum range value: ");
		int min = scanner.nextInt();
		
		int randomNumber = min + (int)(Math.random()*((max-min)+1));
		System.out.println("Random number generated = " + randomNumber);
		
		scanner.close();
	}
}