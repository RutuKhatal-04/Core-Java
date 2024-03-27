import java.io.*;
import java.util.*;
class Hellojava1 implements Runnable
{
            Thread t;
            public Hellojava1(String title)
            {
                        t=new Thread(this,title);
                        t.start();
            }
            public void run()
            {
                        for(int i=0;i<20;i++)
                        {
                                    System.out.println((i+1)+"ThreadName:"+Thread.currentThread().getName());
                                    try
                                    {
                                                Thread.sleep(100);
                                    }
                                    catch(Exception e)
                                    {
                                    }
                                    }
                        }
            }
            public class Hellojava
            {
                        public static void main(String a[])
                        {
                                    System.out.println("ThreadName:"+Thread.currentThread().getName());
                                    Hellojava1 hj=new Hellojava1("HELLO JAVA");
                        }
            }	
