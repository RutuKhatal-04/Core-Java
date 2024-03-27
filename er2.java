import java.awt.*;
import java.awt.event.*;
class myp extends Panel
{
	Button b1,b2,b3,b4,b5;
	myp ()
	{
		Label l1=new Label("Background");
		b1=new Button("Cyan");
		b2=new Button("Red");
		b3=new Button("Green");
		b4=new Button("Orange");
		b5=new Button("Blue");
		add(l1);add(b1);add(b2);add(b3);add(b4);add(b5);
	}
}
class frame extends Frame implements ActionListener
{
	myp p1;
	frame()
	{
		super("Working with graphics");
		p1=new myp();
		add(p1,"East");
		Button b6=new Button("Exit");
		add(b6,"South");
		b6.addActionListener(this);
		p1.b1.addActionListener(this);
		p1.b2.addActionListener(this);
		p1.b3.addActionListener(this);
		p1.b4.addActionListener(this);
		p1.b5.addActionListener(this);
		setSize(500,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e1)
	{
		String s1=e1.getActionCommand();
		if(s1.equals("Exit"))
			System.exit(0);
		else if(s1.equals("Cyan"))
			setBackground(Color.cyan);
		else if(s1.equals("Red"))
			setBackground(Color.red);
		else if(s1.equals("Green"))
			setBackground(Color.green);
		else if(s1.equals("Orange"))
			setBackground(Color.orange);
		else if(s1.equals("Blue"))
			setBackground(Color.blue);
	}
}
class er2
{
	public static void main(String args[])
	{
		frame f1=new frame();
	}
}