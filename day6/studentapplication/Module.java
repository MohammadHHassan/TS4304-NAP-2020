package day6.studentapplication;

public class Module
{
	private String code;
	private String name;
	private int currentNumberOfStudents=0;
	private Student[] students;
	
	public Module(String code, String name, int maxNumberOfStudents)
	{
		this.code = code;
		this.name = name;
		students = new Student[maxNumberOfStudents];
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCode()
	{
		return code;
	}

	public Student[] getStudents()
	{
		return students;
	}
	
	public boolean addStudent(Student student)
	{
		if(currentNumberOfStudents >= students.length)
		{
			return false;
		}
		
		for(int i=0 ; i<students.length ; i++)
		{
			if(students[i] != null)
			{
				if(students[i].getId() == student.getId())
				{
					return false;
				}
			}
		}
		
		students[currentNumberOfStudents] = student;
		currentNumberOfStudents++;
		return true;
	}
	
}
