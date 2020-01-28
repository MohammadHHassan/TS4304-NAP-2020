package day2;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Implement a Scanner class
 * Prompt the user to enter their marks
 * If marks>=50 && marks<=100, 		Pass
 * Else if marks>=0 && marks<50, 	Fail
 * Else, 							Invalid marks entered
 * 
 * Additionally in Pass: 
 * If marks>=80,					Distinction
 * Else if marks>=65 && marks<80,	Merit
 * Else,							Just Pass
 */

public class Exercise1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your marks: ");
		
		try
		{
			double marks = scanner.nextDouble();
			
			if(marks>=50 && marks<=100)
			{
				System.out.println("Pass");
				
				if(marks>=80)
				{
					System.out.println("Distinction");
				}
				else if(marks>=65 && marks<80)
				{
					System.out.println("Merit");
				}
				else
				{
					System.out.println("Just Pass");
				}
			}
			else if(marks>=0 && marks<50)
			{
				System.out.println("Fail");
			}
			else
			{
				System.out.println("Invalid marks entered");
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println("Wrong input");
		}
		
		scanner.close();
	}
}











