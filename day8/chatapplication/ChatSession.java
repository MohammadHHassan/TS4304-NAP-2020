package day8.chatapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatSession implements Runnable
{
	private Socket client1, client2;
	private static int sessionNumber=0;
	
	public ChatSession(Socket client1, Socket client2)
	{
		this.client1 = client1;
		this.client2 = client2;
	}

	@Override
	public void run()
	{
		try
		{
			DataInputStream fromClient1 = new DataInputStream(client1.getInputStream());
			DataOutputStream toClient1 = new DataOutputStream(client1.getOutputStream());
			
			DataInputStream fromClient2 = new DataInputStream(client2.getInputStream());
			DataOutputStream toClient2 = new DataOutputStream(client2.getOutputStream());
			
			String chatID1 = fromClient1.readUTF();
			String chatID2 = fromClient2.readUTF();
			
			System.out.println("\n" + chatID1 + " has been connected with " + chatID2);
			sessionNumber++;
			System.out.println("Chat Session No. " + sessionNumber + " has started\n");
			
			toClient2.writeUTF(chatID1);
			toClient1.writeUTF(chatID2);
			
			while(true)
			{
				if(fromClient1.available()>0)
				{
					String msg = fromClient1.readUTF();
					toClient2.writeUTF(msg);
				}
				
				if(fromClient2.available()>0)
				{
					String msg = fromClient2.readUTF();
					toClient1.writeUTF(msg);
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}