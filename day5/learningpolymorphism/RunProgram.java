package day5.learningpolymorphism;

public class RunProgram
{
	public static void main(String[] args)
	{
		Animals animal1 = new Animals();
		animal1.makeSound();
		
		Dog dog1 = new Dog();
		dog1.makeSound();
		
		animal1 = new Cat();
		animal1.makeSound();
	}
}
