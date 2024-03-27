import java.util.*;
class Count
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
			if(ch>=65 && ch<=90)
			{
				cnt++;
			}
			System.out.println("No. upper case letter:"+cnt);
			if else(ch>=97 && ch<=122)
			{
				cnt++;
			}
			System.out.println("No. lower case letter:"+cnt1);
			if else(ch>=48 && ch<=57)
			{
				cnt++;
			}
			System.out.println("No. digits in string:"+cnt2);
			if else(ch==32)
			{
				cnt++;
			}
			System.out.println("No. of space in string:"+cnt3);
			else(ch!=32 && ch>=0&&ch<=48       ||  ch>=58&&ch<=64 || ch>=91 && ch<=96 || ch>=123&&ch<=255)
			{
				cnt++;
			}
			System.out.println("No.of special symbols in string:"+cnt4);		
	}
}