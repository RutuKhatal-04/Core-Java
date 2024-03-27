import java.util.*;
class Prime
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int i,no;
		System.out.println("Enter the number:");
		no=sc.nextInt();
		for(i=0;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println("prime");
			}
			continue;
		}
	}
}