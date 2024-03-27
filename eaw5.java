import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements ActionListener
{
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
		g1.drawOval(90,90,100,100);
		g1.drawLine(140,130,140,150);
		g1.drawLine(130,160,150,160);
		g1.drawOval(110,110,20,20);
		g1.drawOval(150,110,20,20);
	}
}
class eaw5
{
	public static void main(String args[])
	{
		myframe f1=new myframe();
	}
}