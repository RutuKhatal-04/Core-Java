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

  class Thread4 extends Thread
    {
	public void run()
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println("Cube is: "+(i*i*i));
		
	}
             }
   }

class Threadcall2
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		//t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(1);
		Thread2 t2=new Thread2();
		//t2.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(10);
		Thread3 t3=new Thread3();		                //t3.setPriority(Thread.NORM_PRIORITY);
		Thread4 t4=new Thread4();
		t4.setPriority(t3.getPriority()-1);
		t3.setPriority(5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}