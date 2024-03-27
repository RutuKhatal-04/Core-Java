import java.util.*;
class Fibonacci
{
	public static void main (String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int i=0,n,Firstvalue=1,Secondvalue=0,next;
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		while(i<=n)
		{
			if(i<=1)
			{
				next=i;
			}
			else
			{
				next=Firstvalue+Secondvalue;
				Secondvalue=Firstvalue;
				Firstvalue=next;
				System.out.println(next);
			}
			i++;
		}	
	}
}
				