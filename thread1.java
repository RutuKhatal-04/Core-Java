import java.io.*;
/*write a program to print 1 to 5 using Thread. Use sleep()*/
class thread1
{
public static void main(String []args)
{
for(int i=0;i<5;i++)
{
System.out.println(i);
}

for(int i=0;i<5;i++)
{
try
{
System.out.println(i);
Thread.sleep(1000);
}
catch(InterruptedException e)
{}

}

}
}