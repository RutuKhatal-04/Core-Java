import java.util.*;
class Patient
{
	String pname,dis;
	int pid;
	static int cnt=0;
	Scanner sc=new Scanner(System.in);
	void accept ()
 	{
		System.out.println("\n Enter the patient name:");
		pname=sc.next();
		System.out.println("\n Enter the patient id:");
		pid=sc.nextInt();
		System.out.println("\n Enter the disease:");
		dis=sc.next();
		if(dis.equals("fever"))
		{
			cnt++;
			
		}
			
	}
	
	static void display()
	{
		System.out.println("\n No.of patient having fever:"+cnt);
	}
	
	public static void main(String ar[])
	{
		Patient p[]=new Patient[4];
		int i;
		for(i=0;i<4;i++)
		{
			p[i]=new Patient();
			p[i].accept();
		}
		Patient.display();
		
	}
}