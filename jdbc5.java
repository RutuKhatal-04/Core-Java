import java.io.*;
import java.sql.*;
class jdbc5{
	public static void main(String args[])
	{
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c1=DriverManager.getConnection("jdbc:odbc:Rutu1");
			System.out.println("Connection Successful");
			PreparedStatement p= c1.prepareStatement("insert into Table1 values (?,?,?,?,?)");
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
				p.setInt(1,r);
				p.setString(2,name);
				p.setString(3,cr);
				p.setInt(4,f);
				p.setString(5,dt);
				p.executeUpdate();
				
				
			}
			c1.close();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Input");
		}
		catch(Exception e1)
		{
			System.out.println("sql error:"+e1.getMessage());
		}
	}
}