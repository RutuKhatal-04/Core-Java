import java.util.*;
class Emailcheck extends Exception
{
	Emailcheck(String msg)
	{
		super(msg);
	}
}
class Email
{
	public static void main(String ar[])
	{
		String email;
		char ch;
		int i,cnt=0,x,y;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the email:");
			email=sc.nextLine();
			
			for(i=0;i<email.length();i++)
			{
				ch=email.charAt(i);
				if(ch=='@')
				{
					cnt++;
					x=i;
					if(cnt==2)
					{
						throw new Emailcheck("@ should be used only once");
					}
				}
				else 
				{
					continue;
				}
				if(x<1)
				{
					throw new Emailcheck("please enter valid email id");
				}
				y=email.length();
				
				if(y-x==1)
				{
					throw new Emailcheck("pls enter something after @");
				}
				else
				{
					System.out.println("Email id:"+email);
				}
				
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}