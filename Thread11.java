import java.io.*;

class thread1 extends Thread
{
public void run()
{
	int i;
	int a[]=new int[10];
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	try
	{
	System.out.println("Enter the numbers :  ");
	for(i=0;i<10;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	}
	System.out.println("Reverse of  numbers is :  ");
	for(i=9;i>=0;i--)
	{
		System.out.println(a[i]);
	}
	}
	catch(Exception e)
	{}
}
}
class thread2 extends Thread
{
public void run()
{	int max;
	int i;
	int a[]=new int[10];
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	try
	{
	System.out.println("Enter the numbers :  ");
	for(i=0;i<10;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	}
	max=a[0];	
	System.out.println("The max number is :  ");
	for(i=1;i<10;i++)
	{
		if(a[i]>max)
			max=a[i];
	}
	System.out.println(max);
	}
	catch(Exception e)
	{}
}
}
class Thread11
{
	public static void main(String args[])
	{
		thread1 t1=new thread1();
		thread2 t2=new thread2();
t1.setPriority(10);
		t2.setPriority(5);
		t1.start();
		t2.start();
		
	}
}