import java.util.*;
class Marksheet
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int dm,fds,os,cg;
		float per;
		System.out.println("Enter the marks of dm");
		dm=sc.nextInt();
		System.out.println("Enter the marks of fds");
		fds=sc.nextInt();
		System.out.println("Enter the marks of os");
		os=sc.nextInt();
		System.out.println("Enter the marks of cg");
		cg=sc.nextInt();
		
		per=(dm+fds+os+cg)/4;
		System.out.println("Percentage="+per);
		if(per>=95)
		{
			System.out.println("Grade A");
		}
		else if(per<95 && per>=85)
		{
			System.out.println("Grade B");
		}
		else if(per<85 && per>=70)
		{
			System.out.println("Grade C");
		}
		else if(per<70 && per>=55)
		{
			System.out.println("Grade D");
		}
		else 
		{
			System.out.println("Fail");
		}

	}
}
		
