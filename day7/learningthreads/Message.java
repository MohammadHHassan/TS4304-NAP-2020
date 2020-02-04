package day7.learningthreads;

public class Message implements Runnable
{
	String name;
	
	public Message(String name)
	{
		this.name = name;
	}

	@Override
	public void run()
	{
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println(name + " " + i);
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
