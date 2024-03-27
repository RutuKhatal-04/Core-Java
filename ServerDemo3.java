import java.io.*;
import java.net.*;

public class ServerDemo3
{
	public static void main(String args[]) 
	{
		ServerSocket server = null;
		Socket client = null;

		DataInputStream in = null;
		PrintStream out = null;

		try
		{
			server = new ServerSocket(1234);
	
			System.out.println("Server connected....");

			client = server.accept();

			System.out.println("Client connected....");

			in = new DataInputStream(client.getInputStream());

			out = new PrintStream(client.getOutputStream());

			String msg=null;

			out.println("Welcome");

			while(true)
			{
				msg = in.readLine();

				if(msg.equalsIgnoreCase("Stop")==true)
				{
					break;
				}

				out.println(msg.toUpperCase());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				client.close();
				server.close();
			}
			catch(Exception e)
			{
			}
		}
	}
}