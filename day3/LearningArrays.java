package day3;

public class LearningArrays
{
	public static void main(String[] args)
	{
		int [] number = new int[3];
		number[0] = 10;
		number[1] = 15;
		number[2] = 20;
		
		for(int i=0 ; i<=2 ; i++)
		{
			System.out.print(number[i] + "\t");
		}
		
		System.out.println();
		
		for(int j=0 ; j<number.length ; j++)
		{
			System.out.print(number[j] + "\t");
		}
		
		System.out.println();
		
		for(int k : number)
		{
			System.out.print(k + "\t");
		}
		
		System.out.println();
		
		String [] names = new String[3];
		names[0] = "Mohammad";
		names[1] = "Hj";
		names[2] = "Hassan";
		
		for(String nama : names)
		{
			System.out.print(nama + " ");
		}
	}
}
