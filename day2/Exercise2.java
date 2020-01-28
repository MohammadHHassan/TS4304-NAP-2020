package day2;

import java.util.Scanner;

/* Implement a Scanner class
 * Prompt the user to enter the value 5 (integer)
 * 
 * If the user entered a wrong number, 
 * keep on prompting the user to enter the value 5.
 * 
 * Additionally, count the number of times the user
 * entered a wrong number and print out the value.
 */

public class Exercise2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the value 5: ");
		int value = scanner.nextInt();
		int count=0;
		
		while(value!=5)
		{
			System.out.println("You have entered the wrong value.");
			System.out.println("Please try again: ");
			value = scanner.nextInt();
			count++;
		}
		
		System.out.println("You have entered the correct value.");
		System.out.println("You have entered the wrong value " + count + " times.");
		
		scanner.close();
	}
}







