import java.io.*;
import java.sql.*;
import java.net.*;

class ServerLoginDemo
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket server = new ServerSocket(1234);

		System.out.println("Server Started");

		Socket client = server.accept();

		System.out.println("Client Connected");

		DataInputStream in = new DataInputStream(client.getInputStream());

		PrintStream ps = new PrintStream(client.getOutputStream());

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("Jdbc:Odbc:MCM");
		Statement st = con.createStatement();
		ResultSet rs = null;

		while(true)
		{
			String uname = in.readLine();
			String pass = in.readLine();

			rs = st.executeQuery("select * from login where username='"+uname+"' and password='"+pass+"'");

			if(rs.next())
			{
				ps.println("Correct");
			}
			else
			{
				ps.println("Incorrect");
			}
			
			rs.close();
		}
	
	}
}
