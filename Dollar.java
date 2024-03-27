import java.util.*;
class Dollar
{
	public static void main (String ar[])
	{
		Scanner sc=new Scanner(System.in);
		float a,b,c;
		System.out.println("Enter the money in rupees");
		a=sc.nextFloat();
		System.out.println("Enter the rupee rate");
		b=sc.nextFloat();
		c=a*b;
		System.out.println("Rupees in dollar"+c);
	}
}