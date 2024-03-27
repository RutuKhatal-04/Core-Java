import java.util.*;
class SwapNo
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 1st number");
		a=sc.nextInt();
		System.out.println("Enter 2nd number");
		b=sc.nextInt();
		if(a>b)
		{
			c=b;
			b=a;
			a=c;
			System.out.println("After swapping");
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
		else
		{
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
	}
}
			