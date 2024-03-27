import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter a number:");
			int no = sc.nextInt();
			int f=1;
			while(no > 0)
			{
				f=f*no;
				no--;		
			}	
			System.out.println("Factorial = "+f);
		}
	}

}