import java.util.*;
class ArraySum
{
	public static void main(String ar[])
	{
		int i;
		int a[]=new int [5], b[]=new int[5],sum[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 array 1 elements:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 5 array 2 elements:");
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Sum of elements of both array:");
		for(i=0;i<5;i++)
		{
			sum[i]=a[i]+b[i];
		}
		System.out.println("Display array"+sum[i]);

	}
}

