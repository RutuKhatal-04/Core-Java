import java.util.*;
class Passwordcheck extends Exception
{
	Passwordcheck(String msg)
	{
		super(msg);
	}
}
class Password
{
	public static void main(String ar[])
	{
	String password="Rutu@123";
	String password1;
	Scanner sc=new Scanner(System.in);
	try
	{
		System.out.println("Enter the password:");
		password1=sc.nextLine();
		if(password.equals(password1)==false)
		{
			throw new Passwordcheck("Invalid password");
		}
		else
		{
			System.out.println("Password:"+password1);
		}
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
	}
}