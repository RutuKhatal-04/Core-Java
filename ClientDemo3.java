import java.io.*;
import java.net.*;

public class ClientDemo3
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
			
			while(true)
			{
				String msg = in.readLine();
				System.out.println("Server says : "+msg);

				System.out.print("Enter String : ");
				msg = line.readLine();

				out.println(msg);

				if(msg.equalsIgnoreCase("Stop")==true)
				{
					break;
				}
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