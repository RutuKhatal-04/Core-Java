import java.lang.*;
import java.util.*;
class Reverse extends Thread
{
            Reverse()
            {
                        start();
            }
            public void run()
            {
                        for(int i=1;i<=10;i++)
                                    System.out.println(" "+i);
            }
}
class Vowels extends Thread
{
            String s1;
            Vowels(String s)
            {
                        s1=s;
                        start();
            }
            public void run()
            {
                        System.out.println("Vowels are  ");
                        for(int i=0;i<s1.length();i++)
                        {
                                    char ch=s1.charAt(i);
                                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                                                System.out.print(" "+ch);
                        }
            }
}
public class Demo1 
{
  
    public Demo1() 
   {
    }
   
    public static void main(String[] args)
    {
            Scanner sn=new Scanner(System.in);
            System.out.println("Enter a string");
            String str1=sn.next();
            Reverse r=new Reverse();
            Vowels v=new Vowels(str1);
       
    }
}

