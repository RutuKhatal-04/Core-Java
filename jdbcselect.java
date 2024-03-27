import java.lang.*; 
import java.sql.*;
class jdbcselect
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c1=DriverManager.getConnection("jdbc:odbc:Rutu");
			System.out.println("Connection Successful");
			Statement st=c1.createStatement();
			ResultSet rs=st.executeQuery("select * from stud");
			System.out.println("Student Details ");

			System.out.println("No\tName\tCourse\tFees\tJoiningDate");
			while(rs.next())
			{
				System.out.println(rs.getString("sno")+"\t"+rs.getString("sname")+"\t"+rs.getString("crs")+"\t"+rs.getString("fees")+"\t"+rs.getString("jdt"));
			}
			c1.close();		
		}
		catch(Exception e1)
		{
			System.out.println("Sql Error :"+e1.getMessage());
		}
	}
}
