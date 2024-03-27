//handling multiple events
import java.awt.*;
import java.awt.event.*;
class myframe extends Frame implements ActionListener,WindowListener
{
	myframe()
	{
		super("handling multiple events");
		Button b1= new Button("Exit");
		add(b1,"South");
		b1.addActionListener(this);
		addWindowListener(this);
		setSize(400,500);
		setVisible(true);
	}	
	public void actionPerformed(ActionEvent e1 )
	{
		System.exit(0);
	}
	public void windowClosing(WindowEvent w1)
	{
		System.exit(0);	
	}
	public void windowActivated(WindowEvent w1)
	{
		System.out.println("Activated");
	}
	public void windowDeactivated(WindowEvent w1)
	{
		System.out.println("Deactivated");
	}
	public void windowClosed(WindowEvent w1)
	{
		System.out.println("Closed");
	}
	public void windowIconified(WindowEvent w1)
	{
		System.out.println("Iconified");
	}
	public void windowDeiconified(WindowEvent w1)
	{
		System.out.println("Deiconified");
	}
	public void windowOpened(WindowEvent w1)
	{
		System.out.println("Opened");
	}
}
class eaw2
{
	public static void main(String args[])
	{
		myframe f1=new myframe();
	}
}