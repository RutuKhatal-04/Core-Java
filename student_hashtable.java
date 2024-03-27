//slip6
import java.util.*;
import java.io.*;

class stud
{
	String sname;
	double per;
	static BufferedReader br1;
	static
	{		
		br1=new BufferedReader(new InputStreamReader(System.in));
	}
	void read_data()
	{
		try
		{
			System.out.println("Enter Name:");
			sname=br1.readLine();
			System.out.println("Enter Percentage:");
			String s1=br1.readLine();
			per=Double.parseDouble(s1);
		}
		catch(Exception e)
		{
		}
	}
	void show()
	{
		System.out.println(sname+"\t"+per);
	}
}

class student_hashtable		
{
	public static void main(String a[])
	{
		HashSet h1=new HashSet();
		Iterator i1;
		System.out.println("Enter the number of records:");
		String s2;
		int n;
		try
		{
			s2=stud.br1.readLine();
			n=Integer.parseInt(s2);
			while(n>0)	
			{
				stud s=new stud();
				s.read_data();
				h1.add(s);
				n--;
			}
		}
		catch(Exception e)
		{
		}
		System.out.println("Stud Details");
		System.out.println("----------------");
		System.out.println("Name\tPercentage");
		System.out.println("----------------");
		i1=h1.iterator();
		double max=0;
		while(i1.hasNext())
		{
			stud s=(stud)i1.next();
			s.show();
			if(s.per>max)
			max=s.per;
		}
		System.out.println("Maximum Percentage:"+max+"\n");
	}
}

