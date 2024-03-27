import java.util.*;
class Squares
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n,s,i;
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			s=i*i;
			System.out.println(s);
		}
	}
}
		