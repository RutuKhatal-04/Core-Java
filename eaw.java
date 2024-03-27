import java.awt.*;
import java.awt.event.*;
import java.util.*;
class myframe extends Frame implements ActionListener
{
	Date dt=new Date();
	myframe()
	{
		super("Working with graphics");
		Button b1= new Button("Exit");
		add(b1,"South") ;
		b1.addActionListener(this);
		setSize(400,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e1)
	{
		System.exit(0);
	}
	public void paint(Graphics g1)
	{
		g1.drawOval(30,30,200,200);
		if(dt.getHours()<12)
		g1.drawString("Good Morning",90,120);
		else if(dt.getHours()>=12 && dt.getHours()<16)
		g1.drawString("Good Afternoon",90,120);	
		else
		g1.drawString("Good Evening",90,120);
	}
}
class eaw
{
	public static void main(String args[])
	{
		myframe f1=new myframe();
	}
}