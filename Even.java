import java.util.*;
class Even
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int no,sum=0,count=0;
		System.out.println("Enter the number");
		no=sc.nextInt();
		while(no>0)
		{
			rem=no%10;
			if(rem%2==0)
			{
				count++;
			}
			no=no/10;
		}
		System.out.println(count);
	}
}
