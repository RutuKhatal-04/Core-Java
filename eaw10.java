import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mypanel extends JPanel
{
	JTextField t1,t2,t3;
	JButton b1,b2;
	JLabel l1,l2,l3;
	mypanel()
	{
		l1=new JLabel("Left Click        :");
		l2=new JLabel("Right Click     : ");
		l3=new JLabel("Double Click  :");
		t1=new JTextField("0");
		t2=new JTextField("0");
		t3=new JTextField("0");
		b1=new JButton("Clear");
		b1.setMnemonic('c');
		b2=new JButton("Exit");
		b2.setMnemonic('x');
		setLayout(new GridLayout(4,2));
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);
		add(b1);add(b2);
	}
}
class myframe extends JFrame implements ActionListener,MouseListener
{
	mypanel p1;
	int lcnt=0,rcnt=0,dcnt=0;
	Container c1;
	myframe()
	{
		super("handling Mouse Click Event");
		p1=new mypanel();
		c1=getContentPane();
		c1.setLayout(null);
		p1.setBounds(50,50,160,100);
		c1.add(p1);
		p1.b1.addActionListener(this);	
		p1.b2.addActionListener(this);
		addMouseListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent a1)
	{
		String s1=a1.getActionCommand();
		if(s1.equals("Exit"))
			System.exit(0);
		else
		{
			p1.t1.setText("0");
			p1.t2.setText("0");
			p1.t3.setText("0");
			lcnt=rcnt=dcnt=0;
		}
	}
	public void mouseClicked(MouseEvent m1)
	{
		int cct=m1.getClickCount();
		if(m1.getButton()==1)
			lcnt++;
		else if(m1.getButton()==3)
			rcnt++;
		if(cct==2)
		{
			dcnt++;
			if(m1.getButton()==1)
				lcnt-=2;
			else if(m1.getButton()==3)
				rcnt-=2;
			
		}
		p1.t1.setText(String.valueOf(lcnt));
		p1.t2.setText(String.valueOf(rcnt));
		p1.t3.setText(String.valueOf(dcnt));
	}
	public void mouseEntered(MouseEvent m1){}
	public void mouseExited(MouseEvent m1){}
	public void mousePressed(MouseEvent m1){}
	public void mouseReleased(MouseEvent m1){}
}
class eaw10
{
	public static void main(String args[])
	{
		myframe f1=new myframe();
	}
}