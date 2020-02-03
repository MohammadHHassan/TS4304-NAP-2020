package day6.studentapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Module napModule = new Module("TS4304", "Network Application Programming", 3);
		Student student1 = new Student("Mohammad", 16);
		Student student2 = new Student("Haji", 18);
		Student student3 = new Student("Hassan", 20);
		Student student4 = new Student("Bin", 22);
		
		System.out.println("Module: " + napModule.getCode() + " " + napModule.getName());
		
		printAddingStudent(napModule, student1);
		printAddingStudent(napModule, student2);
		printAddingStudent(napModule, student3);
		printAddingStudent(napModule, student4);
		printAddingStudent(napModule, student1);
	}
	
	public static void printAddingStudent(Module module, Student student)
	{
		System.out.println("Adding student: " + student.getId() + " " + student.getName());
		System.out.println("Successful? " + module.addStudent(student));
	}
}
