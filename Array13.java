import java.util.*;
class Array13
{
	public static void main(String ar[])
	{
		int i,j;
		int a[]=new int [5], b[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 array 1 elements:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 5 array 2 elements:");
		for(j=0;j<5;j++)
		{
			b[j]=sc.nextInt();
		}
		System.out.println("Union:");
		System.out.println(a[i]+b[j]);
		
	}
}