//UDPClient.java

import java.net.*;
import java.io.*;

class UDPClient 
{
   	public static void main(String args[]) throws Exception
   	{
   	  	byte send_data[] = new byte[1024];
   	  
      		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        
      		DatagramSocket client_socket = new DatagramSocket();
      
      		InetAddress IPAddress =  InetAddress.getByName("127.0.0.1");
      
      		while (true)
      		{
      			System.out.println("Type Something (q or Q to quit): ");
      	
      			String data = br.readLine();

			send_data = data.getBytes();
      
        			DatagramPacket send_packet = new DatagramPacket(send_data, send_data.length, IPAddress, 1234);

                		client_socket.send(send_packet);
     	
      			if (data.equals("q") || data.equals("Q"))
			{
      				break;
			}
		}
       
       		client_socket.close();
   	}
}
