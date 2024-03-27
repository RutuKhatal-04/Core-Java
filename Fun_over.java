import java.util.*;
class Fun_over
{
	static double l,b,h,r,s,area;

	static void Area(double l,double b)
	{
		area=l*b;	
		System.out.println("\n Area of reactangle is:"+area);
	}
	static void Area(double s)
	{
		area=s*s;
		System.out.println("\n Area od square is:"+area);
	}
	static double  Area(double b,double h)
	{
		area=1/2*(b*h);
		System.out.println("\n Area of triangle is:"+area);
	}
	static double Area(double r)
	{
		area=3.14*(r*r);
		System.out.println("\n Area of circle is :"+area);
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		Fun_over  a=new Fun_over();
		System.out.println("\n To find the area of rectangle:");
		System.out.println("Enter the value of length and breadth:");
		l=sc.nextDouble();
		b=sc.nextDouble();
	
		a.Area(l,b);
		System.out.println("\n To find the area of circle:");
		System.out.println("\n Enter the value of radius of circle:");
		r=sc.nextDouble();
		
		a.Area(r);
		System.out.println("\n To find the area of triangle:");
		System.out.println("\n Enter the value of base and height:");
		b=sc.nextDouble();
		h=sc.nextDouble();
		
		a.Area(b,h);
		System.out.println("\n To find the area of square:");
		System.out.println("\n Enter the value of side of square:");
		s=sc.nextDouble();
		
		a.Area(s);
	}
}		  
		
	