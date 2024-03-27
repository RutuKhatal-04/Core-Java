import java.io.*;
class Threadwait extends Thread
{
     int i,j,k;
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
		
		}
    	 }//for i
	for(j=6;j<=11;j++)
	{
		System.out.println("  "+j);
		if(j==9)
		{
		try
		{
			wait();
		}
		catch(Exception ex){}
		}
    	 }//for j
	for(k=12;k<=16;k++)
	{
		System.out.println("  "+k);
		if(k==15)
		{
		try
		{
			wait();
		}
		catch(Exception ex){}
		try
		{
		//System.in.read();
	//	notify();
		}
		catch(Exception ee){}
		}
    	 }//for k
      }
}


class ThreadWait2
{
	public static void main(String args[])
	{
		Threadwait tw=new Threadwait();
		tw.start();		
		tw.notify();
	}
}