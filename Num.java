impot java.util.*;
class Num
{
	int no;
	Scanner sc=new Scanner(System.in);
	Num(int n)
	{
		no=n;
	}
	void sortArray()
	{
		int i,j;
		for(i=0;i<n.length-1;i++)
		{
			for(j=i+1;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					n[i]=n[j];
				}
			}
		}	
	}
	public static void main(String ar[])
	{
		Num n[]=new Num[10];
		int i;
		System.out.println("\n Enter the array elements:");
		for(i=0;i<10;i++)
		{
			n[i]=new Num();
			n[i]=nextInt();
		}
		n[].sortArray();
	}
}	
		
	