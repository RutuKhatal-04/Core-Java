import java.util.Scanner;
class AddSw
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1:");
		int n1 = sc.nextInt();
		System.out.println("Enter Number 2:");
		int n2 = sc.nextInt();

		System.out.println("1. Addition");
		System.out.println("2. Subraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter your Choice:");
		int ch = sc.nextInt();
 	
		switch(ch)
		{
			case 1:
			System.out.println("Addition");
			int sum= n1 + n2;
			System.out.println("Addition of two numbers="+sum);
			break;

			case 2:
			System.out.println("Subraction:");
			int sub = n1 - n2;
			System.out.println("Subraction of two Numbers="+sub);
			break;

			case 3:
			System.out.println("Multiplication:");
			int mul = n1*n2;
			System.out.println("Mulriplication of two numbers = "+mul);
			break;
			
			case 4:
			System.out.println("Division:");
			float div = n1 /n2;
			System.out.println("Division of two numbers = "+div);
			break;
			
			default:
			System.out.println("Enter Vaild Choice");
			break;						
		}
	}
}