import java.util.*;
class Bank_account
{
	long acc_no1,acc_no2;
	String nper1,nper2;
	double bal1,bal2;
	Scanner sc= new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter the name of person 1:");
		nper1=sc.next();
		System.out.println("Enter the name of person2 :");
		nper2=sc.next();
		System.out.println("Enter the account_no of per 1:");
		acc_no1=sc.nextLong();
		System.out.println("Enter the account_no of per 2:");
		acc_no2=sc.nextLong();
		System.out.println("Enter the balance of per 1:");
		bal1=sc.nextDouble();
		System.out.println("Enter the balance of per 2:");
		bal2=sc.nextDouble();
	}
	void display()
	{
		System.out.println("\n Name of per1"+nper1);
		System.out.println("\n Account_no of per1"+acc_no1);
		System.out.println("\n Balance of per1"+bal1);
		System.out.println("\n Name of per2"+nper2);
		System.out.println("\n Account_no per2"+acc_no2);
		System.out.println("\n Balance per2"+bal2);
	}
	void compare()
	{
		if(bal1>bal2)
		{
			System.out.println(nper1+" has more balance in account");
		}
		else
		{
			System.out.println(nper2+" has more balance in account"); 
		}
	}

	public static void main(String ar[])
	{
		Bank_account   b=new Bank_account();
		b.accept();
		b.display();
		b.compare();
	}
}