import java.io.*;
import java.sql.*;
class jdbc7{
	public static void main(String args[])
	{
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c1=DriverManager.getConnection("jdbc:odbc:Rutu1");
			System.out.println("Connection Successful");
			Statement st=c1.createStatement();
			String ch="y",s1;
			int r;
			System.out.println("Enter the fees");
			r=Integer.parseInt(br.readLine());
			s1="update Table1 set fees="+r+" where rtrim(fees) like 1200";
			st.executeUpdate(s1);
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