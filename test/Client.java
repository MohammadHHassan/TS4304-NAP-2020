package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 9101);
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			int questionNumber=0;
			int marks=0;
			
			int clientNumber = fromServer.readInt();
			System.out.println("You are client number " + clientNumber);
			
			while(true)
			{	
				questionNumber++;
				int randomNumber1 = fromServer.readInt();
				int randomNumber2 = fromServer.readInt();
				
				
				System.out.println("\nQ" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?");
				int answer = scanner.nextInt();
				toServer.writeInt(answer);
				
				if(answer==(randomNumber1+randomNumber2))
				{
					marks++;
					System.out.println("Correct! :)");
				}
				else
				{
					System.out.println("Incorrect :(");
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
