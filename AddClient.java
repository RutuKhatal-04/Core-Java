import java.rmi.*;
import java.rmi.server.*;

class AddClient
{
	public static void main (String args[]) throws Exception
	{
		try
		{
			AddServerIntf a = (AddServerIntf) Naming.lookup("ADD");

			System.out.println("Add. is = "+a.add(5,10));
			System.out.println("Mul. is = "+a.mul(5,10));
 		}
 		catch (Exception e) 
		{
      			System.out.println (e);
 		}
  	}
}