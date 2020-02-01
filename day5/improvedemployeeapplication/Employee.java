package day5.improvedemployeeapplication;

import java.time.LocalDate;

public class Employee
{
	int id;
	private String name;
	private int birthYear;
	
	private static int countEmployee = 0;
	
	public Employee(String name, int birthYear)
	{
		this.name = name;
		this.birthYear = birthYear;
		countEmployee++;
		this.id = countEmployee;
	}
	
	public int getAge()
	{
		LocalDate now = LocalDate.now();
		return (now.getYear() - birthYear);
	}
	
	public int getNumberOfEmployee()
	{
		return countEmployee;
	}

	@Override
	public String toString() {
		return "[I.D = " + id + ", Name = " + name + ", Birth year = " + birthYear + "]";
	}
}
