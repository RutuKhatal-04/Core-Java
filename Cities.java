import java.util.*;
class Cities
{
	public static void main(String ar[])
	{
		/*String s;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the name of ten cities:");
		s=sc.nextLine();
		char[] c=s.toCharArray();
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		for(i=0;i<s.length;i++)
		{
			System.out.print("In upper case:"+toUpperCase());
		}*/

		String cities[]=new String[10];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 cities name: ");
		for(i=0;i<10;i++)
		{
			cities[i]=sc.next();
		}
		for(i=0;i<10;i++)
		{
			System.out.println("Cities name:"+cities[i].toUpperCase());
		}
		for(i=0;i<9;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(cities[i].equals(cities[j]))
					System.out.println(cities[j]);
			}
		}
		for(i=0;i<10;i++)
		{
			System.out.println("\n First character:"+cities[i].charAt(0));
		}
	}
}