package day2;

/* Copy and paste lines of codes in
 * LearningNestedForLoop.java inside the main method.
 * 
 * This time, sum i and j and display the sum on the table.
 * 
 * Additionally, sum up the total for all the values
 * displayed on the table and print out the result.
 */

public class Exercise3
{
	public static void main(String[] args)
	{
		int i, j, total=0;
		
		for(i=0 ; i<5 ; i++)
		{
			for(j=0 ; j<5 ; j++)
			{
				System.out.print((i+j) + "\t");
				total = total + i + j;
			}
			System.out.println();
		}
		
		System.out.println("Total = " + total);
	}
}
