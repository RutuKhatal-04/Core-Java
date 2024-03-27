import java.util.*;
class ArraySearch
{
	public static void main(String ar[])
	{
		int i;
		int a[]=new int [5],x,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 array 1 elements:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter elements to search:");
		x=sc.nextInt();
		for(i=0;i<5;i++)
		{
			if(x==a[i])
			System.out.println("Search succesfull at index"+i);
		}
		
	}
}		

			
		



		
	
