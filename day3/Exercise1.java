package day3;

import java.util.Scanner;

/* Implement a Scanner class.
 * Prompt the user to enter the number of students in a class.
 * 
 * Store the number of students as the size of an array 
 * of the students' names.
 * 
 * Prompt the user to enter the names of each student.
 * Store the students' names in the array.
 * Print out each of the student's name.
 * 
 * Hint:
 * Use two for loops and make use of <arrayname>.length
 * Loop 1 = To store the names of each student
 * Loop 2 = To display the names of each student
 */

public class Exercise1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number of students: ");
		int numberStudents = scanner.nextInt();
		scanner.nextLine();
		
		String [] names = new String[numberStudents];
		
		for(int i=0 ; i<names.length ; i++)
		{
			System.out.println("Please enter the name of student no. " + (i+1) + ": ");
			names[i] = scanner.nextLine();
		}
		
		for(int j=0 ; j<names.length ; j++)
		{
			System.out.println("Name of student no. " + (j+1) + ": " + names[j]);
		}
		
		scanner.close();
	}
}