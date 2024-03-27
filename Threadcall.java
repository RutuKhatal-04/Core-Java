   class Thread1 extends Thread
    {
	public void run()
	{
	for(int i=1;i<=10;i++)
	{
		if(i%2==0)
		{
			System.out.println(i+" is even");
		}
	}
             }
   }

   class Thread2 extends Thread
    {
	public void run()
	{
	for(int i=1;i<=10;i++)
	{
		if(i%2!=0)
		{
			System.out.println(i+" is odd");
		}
	}
             }
   }

  class Thread3 extends Thread
    {
	public void run()
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println("Square is: "+(i*i));
		
	}
             }
   }


class Threadcall
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread2 t3=new Thread2();
		t1.start();
		t2.start();
		t3.start();
	}
}