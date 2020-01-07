package day1;

public class LearningAssignmentOperator
{
	public static void main(String[] args)
	{
		int x = 1;
		System.out.println("Initially, x = " + x);
		
		x = x+1;
		System.out.println("Incremented, x = " + x);
		
		x++;
		System.out.println("Incremented, x = " + x);
		
		x += 1;
		System.out.println("Incremented, x = "+ x);
		
		x = x-1;
		System.out.println("Decremented, x = " + x);
		
		x--;
		System.out.println("Decremented, x = " + x);
		
		x -= 1;
		System.out.println("Decremented, x = " + x);
		
		int a = 10;
		a /= 2;			// a = a/2
		System.out.println("a/2 = " + a);
		
		a *= 2;			// a = a*2
		System.out.println("a*2 = " + a);
	}
}
