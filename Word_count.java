import java.util.*;
class  Word_count
{
	public static void main(String ar[])
	{
		String s;
		int cnt=0, i;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence:");
		s=sc.nextLine();
		s=s+" ";
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if((int)ch==32)
			{	
				cnt++;
			}
		}
		System.out.println("count of words:"+cnt);
	}
}