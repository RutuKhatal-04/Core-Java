import java.io.*;
import java.net.*;

public class ServerDemo4
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

			out.println("Welcome");

			while(true)
			{
				int no = Integer.parseInt(in.readLine());
				System.out.println("No is : "+no);

				if(no%2==0)
				{
					out.println("Even");
				}
				else
				{
					out.println("Odd");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}