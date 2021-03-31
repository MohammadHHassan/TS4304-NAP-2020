package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server
{
	
	public static void main(String[] args)
	{
		int clientCount=0;
		
		try
		{
			ServerSocket socketServer = new ServerSocket(9101);
			System.out.println("Server started at " + new Date());
			
			while(true)
			{
				Socket socket = socketServer.accept();
				clientCount++;
				System.out.println("\nClient " + (clientCount) + " has been connected");
				int clientNumber = clientCount;
				
				new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						try
						{
							DataInputStream fromClient = new DataInputStream(socket.getInputStream());
							DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());
							toClient.writeInt(clientNumber);
							int questionNumber=0;
							
							while(true)
							{
								questionNumber++;
								
								int randomNumber1 = 10 + (int)(Math.random()*((99-10)+1));
								toClient.writeInt(randomNumber1);
								int randomNumber2 = 10 + (int)(Math.random()*((99-10)+1));
								toClient.writeInt(randomNumber2);
								
								String question = "\nClient " + clientNumber + "'s Q" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?";
								int answer = fromClient.readInt();
								
								if(answer==(randomNumber1+randomNumber2))
								{
									System.out.println(question + " " + answer + " [CORRECT]");
								}
								else
								{
									System.out.println(question + " " + answer + " [INCORRECT]");
								}
							}
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
