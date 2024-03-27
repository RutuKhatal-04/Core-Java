import java.io.*;
class a extends Thread
{
     int i;
   public void run()
    {
	for(i=0;i<=10;i++)
	{
		if(i==3)
		{
			try
			{
				suspend();
			}
			catch(Exception ex){}
		}
		System.out.println(" A "+i);
         	}
   }
}
class B extends Thread
{
	
	public void run()
	{
		for(int j=0;j<10;j++)
		{
			System.out.println(" B= "+j);
		}
	}
}
class ThreadSuspend2 extends Thread
{
	public static void main(String args[])
	{
		System.out.println("Start main thread");
		a ta=new a();
		B tb=new B();
		ta.start();
		tb.start();
		try
		{
			tb.join();
			ta.resume();	
			ta.join();
		}catch(Exception ee){}
		System.out.println("main thread exited");
	}
}