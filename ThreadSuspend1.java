import java.io.*;
class Threadsuspend extends Thread
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
			suspend();
		}
		catch(Exception ex){}
		}
         }
   }
}

class ThreadSuspend1
{
	public static void main(String args[])
	{
		Threadsuspend tw=new Threadsuspend();
		tw.start();		
		try
		{
			tw.join();
			tw.resume();	
		}catch(Exception ee){}
	}
}