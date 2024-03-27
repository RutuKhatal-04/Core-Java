import java.sql.*;
class jdbc2{
	public static void main(String args[])
	{
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c1=DriverManager.getConnection("jdbc:odbc:Rutu1");
		System.out.println("connection successful");
		}
		catch(Exception e1)
		{
			System.out.println("sql Error:"+e1.getMessage());
		}
	}
}