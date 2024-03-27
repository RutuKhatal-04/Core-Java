import java.rmi.*;

public interface AddServerIntf extends Remote
{  
	public int add(int a,int b) throws RemoteException,Exception;
	public int mul(int a,int b) throws RemoteException,Exception;
}

