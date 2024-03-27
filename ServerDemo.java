import java.io.*;
import java.net.*;

public class ServerDemo
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket server = new ServerSocket(1234);

		System.out.println("Server started & waiting for client...");

		Socket client = server.accept();

		System.out.println("Client connected...");

		DataInputStream in = new DataInputStream(client.getInputStream());

		PrintStream out = new PrintStream(client.getOutputStream());

		out.println("Welcome");

		String msg = in.readLine();

		System.out.println("Client says : "+msg);

		client.close();
		server.close();
	}
}