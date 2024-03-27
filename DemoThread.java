
 class DemoT extends Thread
 {
            DemoT1 t;
    String name;   
    public DemoT(String s,DemoT1 t1)
    {
            name=s;
            start();
            t=new DemoT1();
            t1=t;
    }
            public void run()
            {
                        t.Display(name);
            }

}
class DemoT1
{
            synchronized void Display(String name1)
            {
                        try
                        {
                       
                        for(int i=1;i<=5;i++)
                                    {
                                               
                                                System.out.println(name1+"  "+i);
                                    }
                        }catch(Exception e)
                                    {
                                    }
            }
           
}
public class DemoThread
{
            public static void main(String[] args)
    {
            DemoT1 td=new DemoT1();
       DemoT  d=new DemoT("FIRST ",td);
       DemoT d1=new DemoT("SECOND",td);
       DemoT d2=new DemoT("THIRD ",td);
    }
}
