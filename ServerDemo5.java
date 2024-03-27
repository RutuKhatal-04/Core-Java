import java.io.*;
import java.net.*;

class ServerDemo5
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket server = new ServerSocket(1234);

		System.out.println("Server started....");
                                     int i = 0;
		while( i <=3)
		{
			Socket client = server.accept();
			new Chat(client);

			System.out.println("Client connected..");
		i++;
		}
	}
}

class Chat extends Thread
{
	Socket client = null;

	DataInputStream in = null;
	PrintStream out = null;

	Chat(Socket client)
	{
		this.client = client;
		start();
	}	
	
	public void run()
	{
		try
		{
			in = new DataInputStream(client.getInputStream());

			out = new PrintStream(client.getOutputStream());

			out.println("Welcome");

			while(true)
			{
				String msg = in.readLine();
				System.out.println("Client says : "+msg);

				if(msg.equalsIgnoreCase("Stop")==true)
				{
					System.out.println("Client disconnected...");
					break;
				}
	
				out.println(msg);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}