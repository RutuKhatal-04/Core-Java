import java.rmi.*;
import java.rmi.server.*;

public class FactServer extends UnicastRemoteObject implements FactServerIntf
{
	public FactServer() throws RemoteException,Exception 
	{
	}

	public int fact(int a) throws RemoteException,Exception 
	{
		int f=1;
		for(;a>=1;a--)
		{
			f=f*a;
		}
		return f;
	}

	public static void main(String args[])
	{
		try
 		{
      			FactServer server = new FactServer();
      			Naming.rebind ("FACT",server);
      			System.out.println("Server is ready.");
    		} 
		catch(Exception e) 
		{
      			System.out.println ("Server failed: " + e);
    		}
	}
}