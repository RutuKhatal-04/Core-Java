import java.net.*;
class net1
{
	public static void main(String args[]) throws UnknownHostException
	{
		InetAddress address=InetAddress.getLocalHost();
		System.out.println("address="+address);
		address=InetAddress.getByName("google.com");
		System.out.println(address);
		System.out.println("Is website multicast ? "+address.isMulticastAddress());
		InetAddress arr[]=InetAddress.getAllByName("www.google.com");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
		