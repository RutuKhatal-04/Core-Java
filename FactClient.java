import java.rmi.*;
import java.rmi.server.*;

class FactClient
{
	public static void main (String args[]) throws Exception
	{
		try
		{
			FactServerIntf a = (FactServerIntf) Naming.lookup("FACT");

			System.out.println("Factorial is = "+a.fact(5));
 		}
 		catch (Exception e) 
		{
      			System.out.println (e);
 		}
  	}
}