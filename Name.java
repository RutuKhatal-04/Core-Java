import java.util.*;
class Name
{
	public static void main(String ar[])
	{
		String name[]=new String[6];
		String surname[]=new String[6];
		String fullname[]=new String[50];
		String reverse[]=new String[50];
		int i,j;
		char ch;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 6 names");
		for(i=0;i<6;i++)
		{
			name[i]=sc.next();
		}
		System.out.println("Enter 6 surname");
		for(i=0;i<6;i++)
 		{
			surname[i]=sc.next();
		}
		for(i=0;i<6;i++)
		{
			fullname[i]=name[i].concat(" "+ surname[i]);
			
		}
		for(i=0;i<6;i++)
		{
			System.out.println("\n Fullname is :"+fullname[i]);
		}
		for(i=0;i<6;i++)
		{
			reverse[i]="";
			for(j=fullname[i].length()-1;j>=0;j--)
			{
				ch=fullname[i].charAt(j);
				reverse[i]=reverse[i]+ch;
		
			}
		}
		for(i=0;i<6;i++)
		{
			System.out.println("\n Reverse name :"+reverse[i]);
		}
	}
}