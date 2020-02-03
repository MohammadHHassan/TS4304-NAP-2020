package day6.studentapplication;

public class Student
{
	private int id;
	private String name;
	private int age;
	private static int numberOfStudents;
	
	public Student(String name, int age)
	{
		this.name = name;
		setAge(age);			// this.age = age;
		numberOfStudents++;
		this.id = numberOfStudents;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getId()
	{
		return id;
	}
	
	
}
