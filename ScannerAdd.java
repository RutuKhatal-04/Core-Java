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
		
		per=dm+fds+os+cg/4;

		System.out.println("Percentage="+per);
	}
}
		
