import java.io.*;
import java.net.*;

public class ServerDemo2
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

			System.out.println("Server started & waiting for client...");

			client = server.accept();

			System.out.println("Client connected...");
	
			in = new DataInputStream(client.getInputStream());

			out = new PrintStream(client.getOutputStream());

			out.println("Welcome");

			while(true)
			{
				String msg = in.readLine();

				if(msg.equalsIgnoreCase("Stop")==true)
				{
					break;
				}

				double radius = Double.parseDouble(msg);

				double area = 3.14 * radius * radius;

				out.println(""+area);
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