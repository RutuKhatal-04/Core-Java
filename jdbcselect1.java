import java.lang.*;
import java.sql.*;
class jdbcselect1
{
	public static void main(String args[])
	{
	try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection c1=DriverManager.getConnection("jdbc:odbc:Rutu1");
	System.out.println("connection successful");
	Statement st=c1.createStatement();
	ResultSet rs= st.executeQuery("select * from Table1");
	System.out.println("Student details");
	System.out.println("Rollno\tName\t crs\t fees\t Date");
	while(rs.next())
	{
		System.out.println(rs.getString("Rno")+"\t"+rs.getString("Nm")+"\t"+rs.getString("crs")+"\t"+rs.getString("fees")+"\t"+rs.getString("dat"));
	}
	c1.close();
	}
	catch(Exception e)
	{
		System.out.println("Sql error:"+e.getMessage());
	}
	}
}