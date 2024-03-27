import java.io.*;
class Threadwait extends Thread
{
     int i;
   public void run()
    {
	for(i=0;i<=5;i++)
	{
		System.out.println("  "+i);
		if(i==3)
		{
		try
		{
			wait();
		}
		catch(Exception ex){}
		try
		{
		System.in.read();
		notify();
		}
		catch(Exception ee){}
    	 }
	}
   }
}

class ThreadWait1
{
	public static void main(String args[])
	{
		Threadwait tw=new Threadwait();
		tw.start();		
	}
}