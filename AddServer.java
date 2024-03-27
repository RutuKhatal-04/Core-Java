import java.rmi.*;
import java.rmi.server.*;

public class AddServer extends UnicastRemoteObject implements AddServerIntf
{
	public AddServer() throws RemoteException,Exception 
	{
	}

	public int add(int a,int b) throws RemoteException,Exception 
	{
		return a+b;
	}

	public int mul(int a,int b) throws RemoteException,Exception 
	{
		return a*b;
	}
	
	public static void main(String args[])
	{
		try
 		{
      			AddServer server = new AddServer();
      			Naming.rebind ("ADD",server);
      			System.out.println("Server is ready.");
    		} 
		catch(Exception e) 
		{
      			System.out.println ("Server failed: " + e);
    		}
	}
}