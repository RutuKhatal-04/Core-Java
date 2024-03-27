class c1
{
   synchronized void print(String b)
          {
	System.out.println("[");
	try
	{
		Thread.sleep(1000);
	}
	catch(Exception e)
	{}
	System.out.println(b);
	try
	{
		Thread.sleep(1000);
	}
	catch(Exception e)
	{}
	System.out.println("]");

}
}


class thread6 implements Runnable
{
static c1 tt;
Thread t1;
thread6(String s1)
{
t1=new Thread(this,s1);
t1.start();
}
public void run()
{
tt.print(t1.getName());
}

public static void main(String []args)
{
tt=new c1();
thread6 ee=new thread6("hello");    
thread6 cc=new thread6("hai");
}
 
}


