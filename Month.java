import java.util.*;
class Month
{
	String name1,name2;
	int total_day1,holiday1,working_day1,total_day2,holiday2,working_day2;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter the name of month1");
		name1=sc.next();
		System.out.println("\n Enter the name of month 2");
		name2=sc.next();
		System.out.println("\n Enter no.of day in month 1");
		total_day1=sc.nextInt();
		System.out.println("\n Enter no.of day in month 2");
		total_day2=sc.nextInt();
		System.out.println("\n Enter no. of holidays in month 1");
		holiday1=sc.nextInt();
		System.out.println("\n Enter no. of holidays in month 2");
		holiday2=sc.nextInt();
	}
	void display()
	{
		System.out.println("Month 1st:"+name1);
		System.out.println("Month 2nd:"+name2);
		System.out.println("Total days in month 1"+total_day1);
		System.out.println("Total days in month 2"+total_day2);
		System.out.println("Total holidays in month 1"+holiday1);
		System.out.println("Total holiday days in month 2"+holiday2);
	
	}
	public static void main(String ar[])
	{
		Month m=new Month();
		m.accept();
		m.display();
		m.work();
	}
}