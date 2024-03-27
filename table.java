import java.util.*;
class table
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number whose table is to be printed:");
		int no = sc.nextInt();
		int t,i;
		i = 1;
		do{
			t = no*i;
			System.out.println(no+ "*" +i+ "=" +t);
			i++;

		}while(i<= 	10);
	}
	
}