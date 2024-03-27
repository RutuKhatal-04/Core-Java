import java.util.*;
class Cubecheck extends Exception
{
	Cubecheck(String msg)
	{
		super(msg);
	}
}
class Cube
{
	public static void main(String ar[])
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the number:");
			x=sc.nextInt();
			y=x*x*x;
			if(y%2==0)
			{
				
				System.out.println("number is :"+x);
				System.out.println("Cube is :"+y);
			}
			else
			{
				throw new Cubecheck("cube is not even number");

			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
				