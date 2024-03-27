import java.sql.*;
class jdbc1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c1=DriverManager.getConnection("jdbc:odbc:Rutu");
			System.out.println("Connection Successful");
		}
		catch(Exception e1)
		{
			System.out.println("Sql Error :"+e1.getMessage());
		}
	}
}
