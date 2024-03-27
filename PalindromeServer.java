import java.io.*;
import java.net.*;

public class PalindromeServer
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket server = new ServerSocket(1234);

		Socket client = server.accept();

		DataInputStream in = new DataInputStream(client.getInputStream());

		PrintStream out = new PrintStream(client.getOutputStream());

		String msg;

		while(true)
		{
			msg = in.readLine();

			if(msg.equalsIgnoreCase("Stop")==true)
			{
				break;
			}

		/*	StringBuffer str = new StringBuffer(msg);

			str = str.reverse();

			if(msg.equalsIgnoreCase(str.toString())==true)
			{
				out.println("String is palindrome");
			}
			else
			{
				out.println("String is not a palindrome");
			} */

			int i=0,j=msg.length()-1;
			boolean flag=false;
	
			while(i<j)
			{
				if(msg.charAt(i) != msg.charAt(j))
				{
					flag=true;
					break;
				}

				i++;
				j--;
			}
			
			if(flag==false)
			{
				out.println("String is palindrome");
			}
			else
			{
				out.println("String is not a palindrome");
			}
		}

		client.close();
		server.close();
	}
}