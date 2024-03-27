import java.util.*;

class ScannerAdd1
{
	public static void main(String ar[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st and 2 nd number:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a+b;
		System.out.println("Addition = "+c);
	}
}