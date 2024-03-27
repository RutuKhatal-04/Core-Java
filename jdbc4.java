import java.io.*;
import java.sql.*;
class jdbc4{
	public static void main(String args[])
	{
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c1=DriverManager.getConnection("jdbc:odbc:Rutu1");
			System.out.println("Connection Successful");
			Statement st=c1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("select * from Table1");
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
				
				rs.moveToInsertRow();
				rs.updateInt(1,r);
				rs.updateString(2,name);
				rs.updateString(3,cr);
				rs.updateInt(4,f);
				rs.updateString(5,dt);
				rs.insertRow();
				System.out.println("Enter your choice");
				ch=br.readLine();
				
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