import java.util.*;
class prcm 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = sc.nextInt();
		int cnt = 0;

		for(int i = 0; i<no ; i++)
		{
			if(cnt == 2)
			{
				//cnt;
				System.out.println("Prime");	
			}
			else
			{
				System.out.println("Composite");
			}
		}
		
	}
}	