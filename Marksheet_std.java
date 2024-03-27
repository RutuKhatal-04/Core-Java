import java.util.*;
class Marksheet_std
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
	void first()
	{
		if(grade.equals("distinction"))
		{
			System.out.println("\n Roll no="+sno);
			System.out.println("\n Marks of dm="+dm);
			System.out.println("\nMarks of cg="+cg);
			System.out.println("\n Marks of oop="+oop);
			System.out.println("\n Marks of os="+os);
			System.out.println("\n Marks of fds="+fds);
			System.out.println("\n percentage="+per);
			System.out.println("\n Grade="+grade);
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
		System.out.println("\n percentage="+per);
		System.out.println("\n Grade="+grade);
	
	}
	public static void main(String ar[])
	{
		Marksheet_std m[] =new Marksheet_std[5];
		int i;
		for(i=0;i<5;i++)
		{
			m[i]=new Marksheet_std();
			m[i].accept();
			
			m[i].percentage();
			m[i].display();
		}
		for(i=0;i<5;i++)
		{
			m[i].first();
		}
	}
}
	