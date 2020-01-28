package day2;

import java.time.LocalDate;
import java.util.Scanner;

public class LearningLocalDate2
{
	public static void main(String[] args)
	{
		LocalDate now = LocalDate.now();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your birth year: ");
		int birthYear = scanner.nextInt();
		
		System.out.println("Your age is " + (now.getYear()-birthYear));
		
		scanner.close();
	}
}
