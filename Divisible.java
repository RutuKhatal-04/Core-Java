import java.util.*;
class Divisible
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int i,sum=0,count=0;
		for(i=100;i<=200;i++)
		{
			if(i%7==0)
			{
				count++;
				sum=sum+i;
			}
		}
		System.out.println("Total no. divisible by 7 are"+count);
		System.out.println("Sum of all the numbers divisible by 7"+sum);
	}
}