import java.io.*;
import java.sql.*;
class jdbc3{
	public static void main(String args[])
	{
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c1=DriverManager.getConnection("jdbc:odbc:Rutu1");
			System.out.println("Connection Successful");
			Statement st=c1.createStatement();
			String ch="y",name,s1,cr,dt;
			int r,f;
			while(ch.equalsIgnoreCase("y"))
			{
				System.out.println("Enter roll no");
				r=Integer.parseInt(br.readLine());
				System.out.println("Enter name");
				name=br.readLine();
				System.out.println("Enter course name");
				cr=br.readLine();
				System.out.println("Enter fees of the course");
				f=Integer.parseInt(br.readLine());
				System.out.println("Enter the date");
				dt=br.readLine();
				s1="insert into Table1 values("+r+",'"+name+"','"+cr+"',"+f+",'"+dt+"')";
				st.executeUpdate(s1);
				System.out.println("Enter your choice");
				ch=br.readLine();
			}
			c1.close();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid input");
		}
		catch(Exception e1)
		{
			System.out.println("sql error:"+e1.getMessage());
		}
	}
}	