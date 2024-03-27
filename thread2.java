//Write a program to show the illustration of thread methods.		
class thread2
{
Thread t1;

public void aa()   //method name
{
t1=new Thread();

for(int i=0;i<5;i++)
{
try
{
t1.setName("hai "+i);
System.out.println(t1.getName());
System.out.println(t1.currentThread());
System.out.println("\t\t"+i);
System.out.println(t1.MAX_PRIORITY);
System.out.println(t1.MIN_PRIORITY);
System.out.println(t1.NORM_PRIORITY);
Thread.sleep(1000);
}
catch(Exception e)
{}
}
}
public static void main(String []args)
{
thread2 tt=new thread2();
tt.aa();
}
}