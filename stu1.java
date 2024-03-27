import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class stu1 extends JFrame implements ActionListener
{

	Container con;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3,b4,b5;

	TreeSet<String> ts1=new TreeSet<String>();
	ArrayList<String> ar1=new ArrayList<String>();
	ArrayList<String> ar2=new ArrayList<String>();

	stu1(String ss)
	{

		super(ss);
		con=this.getContentPane();

		l1=new JLabel("enter the student code");
		l2=new JLabel("enter the student name");
		l3=new JLabel("enter the student department");
		l4=new JLabel("total record (or) current position");
		l5=new JLabel("");

		t1=new JTextField(25);
		t2=new JTextField(25);
		t3=new JTextField(25);
		t4=new JTextField(25);
		t4.setEnabled(false);

		b1=new JButton("ADD");
		b1.addActionListener(this);
		b1.setActionCommand("add");

		b4=new JButton("SHOW");
		b4.addActionListener(this);
		b4.setActionCommand("show");


		b2=new JButton("CANCEL");
		b2.addActionListener(this);
		b2.setActionCommand("cancel");

		b3=new JButton("EXIT");
		b3.addActionListener(this);
		b3.setActionCommand("exit");

		l1.setBounds(100,100,250,30);
		l2.setBounds(100,150,250,30);
		l3.setBounds(100,200,250,30);
		l4.setBounds(100,250,250,30);

		t1.setBounds(350,100,220,30);
		t2.setBounds(350,150,220,30);
		t3.setBounds(350,200,220,30);
		t4.setBounds(350,250,220,30);

		b1.setBounds(130,350,100,30);
		b4.setBounds(230,350,100,30);
		b2.setBounds(330,350,100,30);
		b3.setBounds(430,350,100,30);

		con.add(l1);
		con.add(l2);
		con.add(l3);
		con.add(l4);
		con.add(t1);
		con.add(t2);
		con.add(t3);
		con.add(t4);
		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(b4);
		con.add(l5);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(1030,800);

	}

	public void actionPerformed(ActionEvent e)
	{

		String s1=e.getActionCommand();
		int x=ts1.size();
		int d1;


		if(s1.equals("add"))
		{

			ts1.add(t1.getText());
			if(ts1.size()>x)
			{

				ar1.add(t2.getText());
				ar2.add(t3.getText());
				x=ts1.size();
				t4.setText(""+x);
			}		
			else
			{
			
				JOptionPane.showMessageDialog(con,"this code field does not support duplicate value","welcome to exit window",JOptionPane.WARNING_MESSAGE);
			}

			t1.setText("");
			t2.setText("");
			t3.setText("");
			t1.requestFocus();
		}

		String s2=t1.getText();
		LinkedList<String> l1=new LinkedList<String>();
		l1.addAll(ts1);
		String s3;
		int y=0;

		for(int i=0;i<l1.size();i++)
		{
			s3=l1.get(i);

			if(s2.equals(s3))
			{
				y=i;
			}

		}


		if(s1.equals("show"))
		{	
			t2.setText(""+ar1.get(y));
			t3.setText(""+ar2.get(y));
			t4.setText(""+(y+1));

		}

		if(s1.equals("cancel"))
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t1.requestFocus();
		}
		
		int ex;

		if(s1.equals("exit"))
		{
			ex=JOptionPane.showConfirmDialog(con,"do u want to exit","welcome to exit window",JOptionPane.YES_NO_OPTION);
			if(ex==0)
			{
				System.exit(0);
			}
		}

	}

	public static void main(String []args)
	{
		stu1 ss1=new stu1("student detail form");
	}
}