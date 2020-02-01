package day5.employeeapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Mohammad", 18);
		System.out.println("Employee 1: " + employee1);
		
		Employee employee2 = new Employee("Hj Hassan", 70);
		System.out.println("Employee 2: " + employee2);
		
		Employee employee3 = new Employee("Bin", 26);
		System.out.println("Employee 3: " + employee3);
		
		employee1.editAge(19);
		System.out.println("Employee 1 after birthday: " + employee1);
		
		System.out.println("Number of employees: " + employee1.getNumberOfEmployee());
		System.out.println("ID of employee 1: " + employee1.id);
	}
}
