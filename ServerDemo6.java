import java.io.*;
import java.net.*;

class ServerDemo6
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket server = new ServerSocket(1234);

		System.out.println("Server started....");

		while(true)
		{
			Socket client = server.accept();

			new Chat1(client);
			new Chat2(client);

			System.out.println("Client connected..");
		}
	}
}

class Chat1 extends Thread
{
	Socket client = null;

	DataInputStream in = null;
	PrintStream out = null;

	Chat1(Socket client)
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

class Chat2 extends Thread
{
	Socket client = null;

	DataInputStream in = null;
	PrintStream out = null;

	Chat2(Socket client)
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
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}