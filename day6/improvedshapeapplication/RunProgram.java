package day6.improvedshapeapplication;

import java.util.Scanner;

public class RunProgram
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		Shape [] shapes = new Shape[10];
		int shapeCounter=0;
		
		System.out.println("Welcome to improved shape application\n");
		
		while(true)
		{
			System.out.println("Your menu: ");
			System.out.println("(1) Circle");
			System.out.println("(2) Rectangle");
			System.out.println("(3) Triangle");
			System.out.println("(4) Square");
			System.out.println("(5) Show previous calculated shapes");
			System.out.println("(6) Edit existing shape's colour");
			System.out.println("(7) Quit\n");
			
			System.out.print("Your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println();
			
			if(choice==1)
			{
				System.out.println("You have chosen a Circle.");
				System.out.println("Please enter a colour: ");
				String circleColour = scanner.nextLine();
				System.out.println("Please enter the radius value: ");
				double radius = scanner.nextDouble();
				scanner.nextLine();
				
				shapes[shapeCounter] = new Circle(circleColour, radius);
				System.out.println(shapes[shapeCounter]);
				shapeCounter++;
				System.out.println();
			}
			else if(choice==2)
			{
				System.out.println("You have chosen a Rectangle.");
				System.out.println("Please enter a colour: ");
				String rectangleColour = scanner.nextLine();
				System.out.println("Please enter the length: ");
				double length = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Please enter the breadth: ");
				double breadth = scanner.nextDouble();
				scanner.nextLine();
				
				shapes[shapeCounter] = new Rectangle(rectangleColour, length, breadth);
				System.out.println(shapes[shapeCounter]);
				shapeCounter++;
				System.out.println();
			}
			else if(choice==3)
			{
				System.out.println("You have chosen a Triangle.");
				System.out.println("Please enter a colour: ");
				String triangleColour = scanner.nextLine();
				System.out.println("Please enter the base: ");
				double base = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Please enter the height: ");
				double height = scanner.nextDouble();
				scanner.nextLine();
				
				shapes[shapeCounter] = new Triangle(triangleColour, base, height);
				System.out.println(shapes[shapeCounter]);
				shapeCounter++;
				System.out.println();
			}
			else if(choice==4)
			{
				System.out.println("You have chosen a Square.");
				System.out.println("Please enter a colour: ");
				String squareColour = scanner.nextLine();
				System.out.println("Please enter the side: ");
				double side = scanner.nextDouble();
				scanner.nextLine();
				
				shapes[shapeCounter] = new Square(squareColour, side);
				System.out.println(shapes[shapeCounter]);
				shapeCounter++;
				System.out.println();
			}
			else if(choice==5)
			{
				System.out.println("Previous calculated shapes: ");
				
				for(int i=0 ; i<shapes.length ; i++)
				{
					if(shapes[i] != null)
					{
						System.out.println((i+1) + ". " + shapes[i]);
					}
					else
					{
						System.out.println("No shapes have been calculated.");
					}
				}
			}
			else if(choice==6)
			{
				System.out.println("Please choose which shape's colour you want to change: ");
				
				for(int i=0 ; i<shapes.length ; i++)
				{
					if(shapes[i] != null)
					{
						System.out.println((i+1) + ". " + shapes[i]);
					}
					else
					{
						System.out.println("No shapes have been calculated.");
					}
				}
				
				System.out.println("\nYour choice: ");
				int shapeNumber = scanner.nextInt();
				scanner.nextLine();
				System.out.println("New colour: ");
				String newColour = scanner.nextLine();
				
				shapes[shapeNumber-1].editColour(newColour);
				System.out.println(shapes[shapeNumber-1]);
			}
			else if(choice==7)
			{
				System.out.println("Thank you");
				break;
			}
			else
			{
				System.out.println("Invalid input. Please choose 1-7.");
			}
			
			System.out.println("\n==========================================\n");
		}
	}
}