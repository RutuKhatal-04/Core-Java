import java.io.*;
import java.sql.*;
class jdbc55{
public static void main(String [] args)
{
	InputStreamReader in=new InputStreamReader(System.in);
	BufferReader br=new BufferReader(in);
	try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection c1=DriverManager.getConnection("jdbc:odbc:Rutu1");
	System.out.println("Connection Successfull");
	PreparedStatement p=c1.prepareStatement("insert intoTable1 values(?,?,?));
	String ch="y",name,s1;
	int r,m;
	while(ch.equalsIgnoreCase("y"))
	{
		System.out.pritnln("Enter no");
		r=Integer.parseInt(br.readLine());
		System.out.pritnln("Enter name");
		name=br.readLine();
		System.out.println("Enter marks");
		n=Integer.parseInt(br.readLine());
		p.setInt(1,r);
		p.setString(2,name);
		p.setInt(3,m);
		p.executeUpdate();
		System.out.println("Enter your choice");
		ch=br.readLine();
	}
	c1.close();
	}
	catch(NumberFormatException e)
	{
		System.out.println("Enter your choice");
		ch=br.readLine();
	}
	catch(Exception e1)
	{
		System.out.pritnln("sqlError:"+e1.getMessage());
	}
	}
}