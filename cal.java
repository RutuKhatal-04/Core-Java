import java.awt.*;
import java.awt.event.*;
class mframe extends Frame implements ActionListener
{
	TextField t1,t2,t3;
	Label l3;
	mframe()
	{
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		Label l1=new Label("Enter 1st no.:");
		Label l2=new Label("Enter 2nd no.:");
		l3=new Label("Result:");
		Button b1=new Button("Add");
		Button b2=new Button("Sub");
		Button b3=new Button("Mul");
		Button b4=new Button("Div");
		setLayout(null);
		l1.setBounds(20,35,80,20);
		t1.setBounds(110,35,100,20);
		l2.setBounds(20,60,80,20);
		t2.setBounds(110,60,100,20);
		l3.setBounds(20,90,80,20);
		t3.setBounds(110,90,100,20);
		b1.setBounds(20,100,80,30);
		b2.setBounds(110,100,80,30);
		b3.setBounds(200,100,80,30);
		b4.setBounds(290,100,80,30);
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);
		add(b1);add(b2);add(b3);add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setSize(700,500);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e1)
	{
		String s1=e1.getActionCommand();
		int num1,num2,num3=0;
		num1=Integer.parseInt(t1.getText());
	 	num2=Integer.parseInt(t2.getText());
		
		if(s1.equals("Add"))
		{
			 num3=num1+num2;
			 t3.setText(String.valueOf(num3));
		
		}	
		else if(s1.equals("Sub"))
		{
			num3=num1-num2;
			t3.setText(String.valueOf(num3));
		}
		else if(s1.equals("Mul"))
		{
			num3=num1*num2;
			t3.setText(String.valueOf(num3));
		}
		else if(s1.equals("Div"))
		{
			num3=num1/num2;
			t3.setText(String.valueOf(num3));
		}
		else
		{
			System.exit(0);
		}
				
	}
	
}
class cal
{
	public static void main(String args[])
	{
		mframe f1=new mframe();
	}
}	