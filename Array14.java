import java.util.*;
class Array14
{
	public static void main(String ar[])
	{
		int i,j,n1,n2;
		int a[], b[];
		boolean flag=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array1");
		n1=sc.nextInt();
		System.out.println("Enter the size of array1");
		n2=sc.nextInt();
		a=new int[n1];
		b=new int[n2];
		System.out.println("Enter 5 array 1 elements:");
		for(i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 5 array 2 elements:");
		for(j=0;j<n2;j++)
		{
			b[j]=sc.nextInt();
		}
		for(j=0;j<n2;j++)
		{
			for(i=0;i<n1;i++)
			{
				if(b[j]==a[i])
					break;
			}
			if(i==n1)
			{	
				System.out.println("Arrray 2 is not a subset of Array 1");
				flag=false;
			}
		}	
		if(flag==true)
		{	
			System.out.println("Array 2 is subset of Array 1");
		}		
		
		
		
	

				
		
	}
}
