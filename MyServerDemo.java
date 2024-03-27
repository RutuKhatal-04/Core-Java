import java.net.*;

public class MyServerDemo
{
	public static void main(String args[]) throws Exception
	{
	        Socket client = new Socket("localhost", 8080);

	        System.out.println("Connected to : " + client.getInetAddress());

	        System.out.println("Port "  + client.getPort());

	        System.out.println("Local Port " + client.getLocalPort());

	        System.out.println("Local Address " + client.getLocalAddress());

	}
}