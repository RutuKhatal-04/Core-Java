import java.io.*;
class Char1 extends Thread
{
      public void run()
      {
             try
             {
	for(int ch=97;ch<=122;ch=ch+2)
	{
	       System.out.println((char)ch);
	       Thread.sleep(1000);
	}
            }catch(InterruptedException ee)
	{
	      System.out.println(ee);
	}
       }
}

class Cum extends Thread
{
      public void run()
      {
              int i,n,sum=1;
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try
	{
	      System.out.println("Enter Number:");
	      n=Integer.parseInt(br.readLine());
	      for(i=2;i<=n;i++)
	      {
		System.out.println("Sum is:"+sum);
		sum=sum+i;
		
	      }
	}
catch(Exception ee)
	       {
		System.out.println(ee);
	       }
      }
}
class Threadcall123
{
       public static void main(String args[])
       {
	Char1 c1=new Char1();
	Cum c=new Cum();
	c1.start();
	c.start();
       }
}
