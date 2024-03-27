import java.util.*;
class evenorodd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number"); 
		int no = sc.nextInt();

		if(no % 2 == 0)
		{
			System.out.println(no+ "is an even number");
		}
		else
		{
			System.out.println( no+  "  is an odd number");
		}		
	}
}