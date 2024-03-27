import java.util.*;
class Marksheet_std1
{
	int sno,dm,fds,oop,os,cg,sum;
	float per;
	String grade;
	Scanner sc =new Scanner(System.in);
	void accept()
	{
		System.out.println("\n Enter the roll no of student:");
		sno=sc.nextInt();
		System.out.println("\n Enter the marks of DM:");
		dm=sc.nextInt();
		System.out.println("\n Enter the marks of CG:");
		cg=sc.nextInt();
		System.out.println("\n Enter the marks of OOP:");
		oop=sc.nextInt();
		System.out.println("\n Enter the marks of OS:");
		os=sc.nextInt();
		System.out.println("\n Enter the marks of FDS:");
		fds=sc.nextInt();
		
		
	}
	void percentage()
	{
		sum=dm+fds+oop+os+cg;
		per=sum/5;
		System.out.println("\n Percentage is :"+per);
		if(per>=85)
		{
		 	grade="distinction";	
		}
		else if(per>=75 && per<85)
		{
			grade="first class";
		}
		else if(per>=65 && per<75)
		{
			grade="second class";
		}
		else if(per>=55 && per<65)
		{
			grade="third class";
		}
		else
		{
			grade="fail";
		}
		
		
	}
	void display()
	{
		System.out.println("\n Roll no="+sno);
		System.out.println("\n Marks of dm="+dm);
		System.out.println("\nMarks of cg="+cg);
		System.out.println("\n Marks of oop="+oop);
		System.out.println("\n Marks of os="+os);
		System.out.println("\n Marks of fds="+fds);
		System.out.println("\n Percentage="+per);
		System.out.println("\nGrade="+grade);
	}

		
		
		
			
	public static void main(String ar[])
	{
		Marksheet_std1 m[] =new Marksheet_std1[5];
		int i;
		for(i=0;i<5;i++)
		{
		m[i]=new Marksheet_std1();
		m[i].accept();
		m[i].display();
		m[i].percentage();
		if(grade=="distinction")
		{
			m
		
		}
	}
}