import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class myframe extends JFrame implements MouseMotionListener,ComponentListener
{
	JLabel l1,l2,l3,l4;
	Container c1;
	int wd,ht;
	myframe()
	{
		super("Handling mouse move & component event");
		l1=new JLabel("X : ");
		l2=new JLabel();
		l3=new JLabel("Y : ");
		l4=new JLabel();
		c1=getContentPane();
		c1.setLayout(null);
		addMouseMotionListener(this);
		addComponentListener(this);
		c1.add(l1);c1.add(l2);
		c1.add(l3);c1.add(l4);
		setSize(400,300);
		setVisible(true);
	}
	public void mouseMoved(MouseEvent m1)
	{
		l2.setText(String.valueOf(m1.getX()));
		l4.setText(String.valueOf(m1.getY()));
	}
	public void mouseDragged(MouseEvent m1)
	{
	}
	public void componentResized(ComponentEvent c1)
	{
		wd=getWidth();
		ht=getHeight();
		l1.setBounds(wd-120,ht-60,20,20);
		l2.setBounds(wd-105,ht-60,30,20);
		l3.setBounds(wd-80,ht-60,20,20);
		l4.setBounds(wd-65,ht-60,30,20);
	}
	public void componentMoved(ComponentEvent c1)
	{
	}
	public void componentShown(ComponentEvent c1)
	{
	}
	public void componentHidden(ComponentEvent c1)
	{
	}
}
class eaw9
{
	public static void main(String args[])
	{
		myframe m1=new myframe();
	}
}