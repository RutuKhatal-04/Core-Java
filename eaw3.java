/* when we set layout maneger as null  that means no layout maneger
therefore we have to set the bounds of each & every component*/

import java.awt.*;
import java.awt.event.*;
class myframe extends Frame implements ActionListener
{
	TextField t1,t2;
	Label l3;
	static int cnt=0;		
	myframe()
	{
		super("login/password Form");
		t1=new TextField();
		t2=new TextField();
		Label l1=new Label("Login :");
		Label l2=new Label("password :");
		Button b1=new Button("OK");
		Button b2=new Button("Cancel");
		Button b3=new Button("Exit");
		l3=new Label();
		t2.setEchoChar('@');
		setLayout(null);
		l1.setBounds(20,35,80,20);
		t1.setBounds(110,35,100,20);
		l2.setBounds(20,60,80,20);
		t2.setBounds(110,60,100,20);
		b1.setBounds(20,100,80,30);
		b2.setBounds(110,100,80,30);
		b3.setBounds(200,100,80,30);
		l3.setBounds(80,150,150,20);		
		add(l1);add(t1);add(l2);add(t2);
		add(b1);add(b2);add(b3);add(l3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setSize(400,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e1)
	{
		String s1= e1.getActionCommand();
		
		if(s1.equals("Exit"))	
			System.exit(0);
		else if(s1.equals("Cancel"))
		{
			t1.setText(" ");
			t2.setText(" ");
			t1.requestFocus();
		}
		else
		{
			if(cnt<3)
			{
			String login=t1.getText();
			String pwd=t2.getText();
			
			if(login.equals("fca"))
			{
				if(pwd.equals("friends"))
					l3.setText("Login Succesful");
				else
				{
					l3.setText("Login NotSuccesful");	
					cnt++;
				}		
			}
			else
			{
				cnt++;
				l3.setText("Login invalid"); 
			}
			}
			else
			{
				System.exit(0);
			}
			
		}
	}
}
class eaw3
{
	public static void main(String args[])
	{
		myframe f1=new myframe();
	}
}