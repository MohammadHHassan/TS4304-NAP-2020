package shape2d3dapp;

public class RunProgram 
{
	public static void main(String[] args)
	{
		Shape2D [] shapes1 = new Shape2D[5];
		shapes1[0] = new Circle("Pink", 2.5);
		shapes1[1] = new Rectangle("Black", 5.2, 6);
		shapes1[2] = new Square("White", 10);
		shapes1[3] = new Circle("Blue", 8.5);
		shapes1[4] = new Rectangle("Red", 1, 2);
		
		for(int i=0 ; i<shapes1.length ; i++)
		{
			System.out.println("--- Shape No. " + i + " ---");
			System.out.println(shapes1[i]);
			System.out.println("=========================\n");
		}
		
		int numberOfCircle=0;
		int numberOfRectangle=0;
		int numberOfSquare=0;
		
		for(int j=0 ; j<shapes1.length ; j++)
		{
			if(shapes1[j] instanceof Circle)
			{
				numberOfCircle++;
			}
			
			if(shapes1[j] instanceof Rectangle)
			{
				numberOfRectangle++;
			}
			
			if(shapes1[j] instanceof Square)
			{
				numberOfSquare++;
			}
		}
		
		System.out.println("Number of circle: " + numberOfCircle);
		System.out.println("Number of rectangle: " + numberOfRectangle);
		System.out.println("Number of square: " + numberOfSquare);
	}
}