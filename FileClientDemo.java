import java.io.*;
import java.net.*;

public class FileClientDemo
{
	public static void main(String args[]) throws Exception
	{
		Socket client = new Socket("localhost",1234);

		DataInputStream in = new DataInputStream(client.getInputStream());

		PrintStream out = new PrintStream(client.getOutputStream());

		DataInputStream line = new DataInputStream(System.in);

		System.out.print("Enter File Name : ");
		String fname = line.readLine();

		out.println(fname);

		String cont = in.readLine();

		System.out.println(cont);

		client.close();
	}
}