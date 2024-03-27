import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class mypanel1 extends JPanel
{
	JTextField t1,t2,t3,t4,t5;
	mypanel1()
	{
		setLayout(null);
		JLabel l1=new JLabel("Roll No"); 
		JLabel l2=new JLabel("Name");
		JLabel l3=new JLabel("Course");
		JLabel l4=new JLabel("Fees");
		JLabel l5=new JLabel("Date");
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();

		t1.setEnabled(false);
		t2.setEnabled(false);
		t3.setEnabled(false);
		t4.setEnabled(false);	
		t5.setEnabled(false);
		l1.setBounds(30,40,100,20);
		l2.setBounds(30,70,100,20);
		l3.setBounds(30,100,100,20);
		l4.setBounds(30,130,100,20);
		l5.setBounds(30,160,100,20);
		t1.setBounds(140,40,30,20);
		t2.setBounds(140,70,150,20);
		t3.setBounds(140,100,40,20);
		t4.setBounds(140,130,50,20);
		t5.setBounds(140,160,100,20);
		add(l1);add(t1);add(l4);add(l5);
		add(l2);add(t2);add(t4);add(t5);
		add(l3);add(t3);
	}
}

class mypanel2 extends JPanel
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	mypanel2()
	{
		b1=new JButton("Addnew");
		b2=new JButton("Prev");
		b3=new JButton("Next");
		b4=new JButton("First");
		b5=new JButton("Last");
		b6=new JButton("Modify");
		b7=new JButton("Delete");
		b8=new JButton("Save");
		b9=new JButton("Cancle");
		b10=new JButton("Exit");
		
		add(b1);add(b2);add(b3);add(b4);add(b5);
		add(b6);add(b7);add(b8);add(b9);add(b10);
		setBackground(Color.pink);
	}
}
class myframe extends JFrame implements ActionListener
{
	mypanel1 p1;
	mypanel2 p2;
	Connection cn1;
	Statement st1,st2;
	ResultSet rs1,rs2;
	int Rno,f=0;
	
	String dat,crs,fees;
	
	String nm;
	myframe()
	{
		super("working with database");
		setLayout(new BorderLayout());
		setSize(400,300);
		setVisible(true);	
		try
		{
			p1=new mypanel1();
			p2=new mypanel2();
			p2.b1.addActionListener(this);
			p2.b2.addActionListener(this);
			p2.b3.addActionListener(this);
			p2.b4.addActionListener(this);
			p2.b5.addActionListener(this);
			p2.b6.addActionListener(this);
			p2.b7.addActionListener(this);
			p2.b8.addActionListener(this);
			p2.b9.addActionListener(this);
			p2.b10.addActionListener(this);
			
			add(p1);
			add(p2,"South");
			setConnection();
			enabletextfields(false);
			if(rs1.next())
			{
				enablebutton(true);
				showfields();
			}
			else
			{
				enablebutton(false);
				p2.b8.setEnabled(false);
				p2.b9.setEnabled(false);
				p2.b10.setEnabled(false);
			}
		}
		catch(Exception e1)
		{
			System.out.println("Sql Error "+e1);
		}
	}
	void setConnection()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			cn1=DriverManager.getConnection("jdbc:odbc:Rutu1");
			st1=cn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			st2=cn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs1=st1.executeQuery("select * from Table1");
		}			
		catch(Exception e1)
		{
			System.out.println("Sql Error "+e1);
		}
	}
	void showfields()
	{
		try
		{
			p1.t1.setText(rs1.getString("Rno"));
			p1.t2.setText(rs1.getString("nm"));
			p1.t3.setText(rs1.getString("crs"));
			p1.t4.setText(rs1.getString("fees"));
			p1.t5.setText(rs1.getString("dat"));
		}
		catch(Exception e1)
		{
			System.out.println("Sql Error "+e1);
		}
	}
	void enabletextfields(boolean flag)
	{
		p1.t2.setEnabled(flag);
		p1.t3.setEnabled(flag);
		p1.t3.setEnabled(flag);
		p1.t4.setEnabled(flag);
		p1.t5.setEnabled(flag);
	}
	void cleartextfields()
	{
		p1.t1.setText("");
		p1.t2.setText("");
		p1.t3.setText("");
		p1.t4.setText(" ");
		p1.t5.setText(" ");
	}
	void enablebutton(boolean flag)
	{
		p2.b1.setEnabled(flag);
		p2.b2.setEnabled(flag);
		p2.b3.setEnabled(flag);
		p2.b4.setEnabled(flag);
		p2.b5.setEnabled(flag);
		p2.b6.setEnabled(flag);
		p2.b7.setEnabled(flag);
		p2.b8.setEnabled(flag);
		p2.b9.setEnabled(flag);
	}
	public void actionPerformed(ActionEvent a1)
	{
		String s1=a1.getActionCommand();
		try
		{
			if(s1.equals("Exit"))
			{
				cn1.close();
				System.exit(0);
			}
			else if(s1.equals("Next"))
			{
				if(rs1.next())
					showfields();
				else
					rs1.last();
			}
			else if(s1.equals("Prev"))
			{
				if(rs1.previous())
					showfields();
				else
					rs1.first();
			}
			else if(s1.equals("First"))
			{
				rs1.first();
				showfields();
			}
			else if(s1.equals("Last"))
			{
				rs1.last();
				showfields();
			}
			else if(s1.equals("Addnew"))
			{
				f=1;
				cleartextfields();
				rs2=st2.executeQuery("select max(Rno) from Table1");
				if(rs2.next())
					p1.t1.setText(String.valueOf(rs2.getInt(1)+1));
				else 
					p1.t1.setText("1");
				enablebutton(false);
				enabletextfields(true);
				p1.t2.requestFocus();
				p1.t3.requestFocus();
				p1.t4.requestFocus();
				p1.t5.requestFocus();
				p2.b8.setEnabled(true);
			}
			else if(s1.equals("Modify"))
			{
				f=2;
				enablebutton(false);
				enabletextfields(true);
				p1.t2.requestFocus();
				p2.b8.setEnabled(true);
			}
			else if(s1.equals("Save"))
			{
				try
				{
				Rno=Integer.parseInt(p1.t1.getText());
				nm=p1.t2.getText();
				crs=p1.t3.getText();
				fees=p1.t4.getText();
				dat=p1.t5.getText();
				
				if(f==1)
				{				
					rs1.moveToInsertRow();
					rs1.updateInt(1,Rno);
					rs1.updateString(2,nm);
					rs1.updateString(3,crs);
					rs1.updateString(4,fees);
					rs1.updateString(5,dat);


					rs1.insertRow();
				}
				else if(f==2)
				{
					rs1.updateString(2,nm);
					rs1.updateString(3,crs);
					rs1.updateString(4,fees);
					rs1.updateString(5,dat);
					rs1.updateRow();
				}
				rs1=st1.executeQuery("select * from Table1");
				rs1.last();
				showfields();
				enablebutton(true);
				enabletextfields(false);
				}
				catch(Exception e1)
				{
					System.out.println("Error :"+e1);
				}
			}
			else if(s1.equals("Cancel"))
			{
				enablebutton(true);
				enabletextfields(false);
				rs1.refreshRow();
			}
			else if(s1.equals("Delete"))
			{
				rs1.deleteRow();
				if(rs1.last())
				{
					showfields();
				}
				else
				{
					enablebutton(false);
					p2.b8.setEnabled(false);
					p2.b9.setEnabled(false);
					cleartextfields();
				}
			}
							
		}
		catch(Exception e1)
		{
			System.out.println("Sql error "+e1);
			System.exit(0);
		}
	}
}
class jdbcsw2
{
	public static void main(String args[])
	{
		myframe m1=new myframe();
	}
}
