import java.io.*;
import java.net.*;

public class PalindromeClient
{
	public static void main(String args[])
	{
		Socket client = null;

		DataInputStream in = null;
		PrintStream out = null;
		DataInputStream line = null;

		try
		{
			client = new Socket("localhost",1234);

			in = new DataInputStream(client.getInputStream());

			line = new DataInputStream(System.in);

			out = new PrintStream(client.getOutputStream());
			
			String msg;

			while(true)
			{
				System.out.print("Enter Message : ");
				msg = line.readLine();

				out.println(msg);

				if(msg.equalsIgnoreCase("Stop")==true)
				{
					break;
				}

				msg = in.readLine();
				System.out.println(msg);
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
			}
			catch(Exception e)
			{
			}
		}
	}
}