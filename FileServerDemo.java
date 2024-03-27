import java.io.*;
import java.net.*;

public class FileServerDemo
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket server = new ServerSocket(1234);

		System.out.println("Server started & waiting for client...");

		Socket client = server.accept();

		System.out.println("Client connected");

		DataInputStream in = new DataInputStream(client.getInputStream());

		PrintStream ps = new PrintStream(client.getOutputStream());

		String fname = in.readLine();

		String cont="",line;

		File f = new File(fname);

		if(f.exists()==true)
		{
			FileInputStream fin = new FileInputStream(fname);

			DataInputStream din = new DataInputStream(fin);

			while((line=din.readLine())!=null)
			{
				cont = cont+line;
			}
			
			fin.close();
		}
		else
		{
			cont = "File does not exists";
		}

		ps.println(cont);	

		client.close();
		server.close();
	}
}