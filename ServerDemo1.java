import java.io.*;
import java.net.*;

public class ServerDemo1
{
	public static void main(String args[])
	{
		ServerSocket server = null;
		Socket client = null;

		DataInputStream in = null;
		PrintStream out = null;
		DataInputStream line = null;
		try
		{
			server = new ServerSocket(1234);

			System.out.println("Server started & waiting for client...");

			client = server.accept();

			System.out.println("Client connected...");
	
			in = new DataInputStream(client.getInputStream());

			out = new PrintStream(client.getOutputStream());
			
			line = new DataInputStream(System.in);


			out.println("Welcome");

			while(true)
			{
				String msg = in.readLine();
				System.out.println("Client says : "+msg);
				System.out.print("Enter msg : ");
				msg = line.readLine();
				out.println(msg);
				if(msg.equalsIgnoreCase("Stop")==true)
				{
					break;
				}

				out.println(msg);
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