import java.util.*;
class Student
{
	int sno;
	String snm,crs;
	float fees;
	Scanner sc =new Scanner(System.in);
	void accept()
	{
		System.out.println("\n Enter student no,name,course,fees:");
		sno=sc.nextInt();
		snm=sc.next();
		crs=sc.next();
		fees=sc.nextFloat();
	}
	void display()
	{
		System.out.println("Sno="+sno);
		System.out.println("Sname="+snm);
		System.out.println("course name="+crs);
		System.out.println("Fees="+fees);
	}
	public static void main(String ar[])
	{
		Student s=new Student();
		s.accept();
		s.display();
	}
}