import java.util.*;
class Replace_ch
{
	public static void main(String ar[])
	{
		String s,s1="";
		int cnt=0,i;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence:");
		s=sc.nextLine();
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(Character.isLetter(ch))
			{
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				s1=s1+"*";
			}
			else
			{
				int x=(int)ch;
				x=x+1;
				char ch1=(char)x;
				s1=s1+ch1;
			}
			}
			else
			{
				s1=s1+ch;
			}
		}
		System.out.println("New string:"+s1);
	}
}