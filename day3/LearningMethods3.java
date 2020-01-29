package day3;

public class LearningMethods3
{
	public static void main(String[] args)
	{
		System.out.println(printName("Mohammad", 26));
		
		String text2 = printName("Bin", 10);
		System.out.println(text2);
		
		displayName("Hj Hassan", 70);
	}
	
	public static String printName(String name, int age)
	{
		String text = "My name is " + name + " and I am " + age + " years old.";
		
		return text;
	}
	
	public static void displayName(String name, int age)
	{
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
}
