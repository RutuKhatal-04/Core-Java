import java.awt.*;
import java.awt.event.*;
import java.util.*;
class frame extends Frame implements ActionListener
{
	Date dt=new Date();
	frame()
	{
		super("working with graphics");
		Button b1=new Button("Exit");
		add(b1,"South");
		b1.addActionListener(this);
		setSize(400,700);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e1)
	{
		System.exit(0);
	}
	public void paint(Graphics g1)
	{
		g1.drawOval(30,30,20,200);
		if(dt.getHours()<12)
			g1.drawString("Good Morning",90,120);
		else if(dt.getHours()>=12 && dt.getHours()<16)
			g1.drawString("Good Afternoon",90,120);
		else
			g1.drawString("Good Evening",90,120);
	}
}
class r1
{
	public static void main(String args[])
	{
		frame f1=new frame();
	}
} 
