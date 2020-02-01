package day5.improvedemployeeapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Mohammad", 1993);
		System.out.println("Employee 1: " + employee1);
		
		Employee employee2 = new Employee("Hj Hassan", 1949);
		System.out.println("Employee 2: " + employee2);
		
		System.out.println("Employee 1's age is " + employee1.getAge());
	}
}
