import java.awt.*;
import java.awt.event.*;

class mypanel extends Panel
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	mypanel()
	{
		Label l1=new Label("Background");
		b1=new Button("Red");
		b2=new Button("Green");
		b3=new Button("Blue");
		b4=new Button("Yellow");
		b5=new Button("Magenta");
		b6=new Button("Cyan");
		b7=new Button("White");
		b8=new Button("Black");
		b9=new Button("Pink");
		b10=new Button("Orange");
		b11=new Button("Gray");
		setLayout(new GridLayout(12,1));
		add(l1);add(b1);add(b2);add(b3);add(b4);
		add(b5);add(b6);add(b7);add(b8);add(b9);
		add(b10);add(b11);
	}
}
class myframe extends Frame implements ActionListener
{
	mypanel p1;
	myframe()
	{
		super("working with color"); //
		p1=new mypanel();
		add(p1,"East");
		Button b1=new Button("Exit");
		add(b1,"South");
		b1.addActionListener(this);
		p1.b1.addActionListener(this);
		p1.b2.addActionListener(this);
		p1.b3.addActionListener(this);
		p1.b4.addActionListener(this);
		p1.b5.addActionListener(this);
		p1.b6.addActionListener(this);
		p1.b7.addActionListener(this);
		p1.b8.addActionListener(this);
		p1.b9.addActionListener(this);
		p1.b10.addActionListener(this);
		p1.b11.addActionListener(this);
		setSize(500,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e1)
	{
		String s1= e1.getActionCommand();
		if(s1.equals("Exit"))
			System.exit(0);
		else if(s1.equals("Red"))
			setBackground(Color.red);
		else if(s1.equals("Green"))
			setBackground(Color.green);
		else if(s1.equals("Blue"))
			setBackground(Color.blue);
		else if(s1.equals("Yellow"))
			setBackground(Color.yellow);
		else if(s1.equals("Magenta"))
			setBackground(Color.magenta);
		else if(s1.equals("Cyan"))
			setBackground(Color.cyan);
		else if(s1.equals("White"))
			setBackground(Color.white);
		else if(s1.equals("Black"))
			setBackground(Color.black);
		else if(s1.equals("Gray"))
			setBackground(Color.gray);
		else if(s1.equals("Orange"))
			setBackground(Color.orange);
		else if(s1.equals("Pink"))
			setBackground(Color.pink);
	}
}
class eaw6
{
	public static void main(String args[])
	{
		myframe f1=new myframe();
	}
}