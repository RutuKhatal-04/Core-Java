import java.util.*;
class  Palindrome
{
	public static void main(String ar[])
	{
		String s;
		int cnt=0, i;
		char ch,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence:");
		s=sc.nextLine();
		System.out.println("Enter the character:");
		a=sc.next().charAt(0);
		for(i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			if(ch==a)
			cnt++;
			
		}
		System.out.println("Occurance of character:"+cnt);
	}
}