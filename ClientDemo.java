import java.io.*;
import java.net.*;

public class ClientDemo
{
	public static void main(String args[]) throws Exception
	{
		Socket client = new Socket("localhost",1234);

		DataInputStream in = new DataInputStream(client.getInputStream());

		PrintStream out = new PrintStream(client.getOutputStream());

		String msg = in.readLine();

		System.out.println("Server says : "+msg);

		out.println("bye");

		client.close();
	}
}