import java.rmi.*;

public interface FactServerIntf extends Remote
{  
	public int fact(int a) throws RemoteException,Exception;
}

