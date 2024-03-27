import java.util.*;
class ArraySort
{
	public static void main(String ar[])
	{
		int i;
		int a[]=new int [5],temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 array 1 elements:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("After sorting:");
		for(i=0;i<4;i++)
		{
			if(a[i]>a[i+1])
			{
				temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
			}
		}
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}
		