import java.util.*;
class Sum
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int no,rem,sum=0;
		System.out.println("Enter the number");
		no=sc.nextInt();
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}
}
		