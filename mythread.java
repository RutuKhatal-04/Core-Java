import java.io.*;
import java.util.*;
class mythread implements Runnable
{
            Thread t;
	public mythread()
            {
                        t=new Thread(this);
                        t.start();
                       
            }
            public  void run()
            {
                        char ch;
                        for (ch='a';ch<='z';ch++)
                        {
                                    System.out.println(ch);
                                    try
                                    {
                                       Thread.sleep(300);  
                                    }
                                    catch(Exception e)
                                    {
                                    }
                        }
            }
	public static void main(String [] args)
	{
		mythread m=new mythread();
	}

}