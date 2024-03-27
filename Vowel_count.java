import java.util.*;
class Vowel_count
{
	public static void main(String ar[])
	{
		String s;
		int cnt=0,i;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence:");
		s=sc.nextLine();
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			cnt++;
		}
		System.out.println("No. of vowels:"+cnt);
	}
}