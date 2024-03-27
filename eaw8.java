/*working with scroll bar & color
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myframe extends JFrame implements AdjustmentListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JPanel p1;
	JScrollBar  sb1,sb2,sb3;
	Container  c1;
	myframe()
	{
		super("working with scrollbar"); 
		l1=new JLabel("Red");
		l2=new JLabel("Green");
		l3=new JLabel("Blue");
		l4=new JLabel("0");
		l5=new JLabel("0");
		l6=new JLabel("0");
		sb1=new JScrollBar(Scrollbar.HORIZONTAL,0,0,0,255);
		sb2=new JScrollBar(Scrollbar.HORIZONTAL,0,0,0,255);
		sb3=new JScrollBar(Scrollbar.HORIZONTAL,15,0,0,255);
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		sb3.addAdjustmentListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p1=new JPanel();
		p1.setBackground(new Color(0,0,0));
		p1.setBounds(100,50,200,100);
		l1.setBounds(20,160,40,20);
		sb1.setBounds(70,160,200,20);
		l4.setBounds(300,160,50,20);		
		l2.setBounds(20,190,40,20);
		sb2.setBounds(70,190,200,20);
		l5.setBounds(300,190,50,20);
		l3.setBounds(20,220,40,20);
		sb3.setBounds(70,220,200,20);
		l6.setBounds(300,220,50,20);
		c1=getContentPane();
		c1.setLayout(null);
		c1.add(l1);c1.add(sb1);c1.add(l4);
		c1.add(l2);c1.add(sb2);c1.add(l5);
		c1.add(l3);c1.add(sb3);c1.add(l6);
		c1.add(p1);
		setSize(400,300);
		setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e1)
	{
		Color c1= new Color(sb1.getValue(),sb2.getValue(),sb3.getValue());
		
		p1.setBackground(c1);
		l4.setText(String.valueOf(sb1.getValue()));
		l5.setText(String.valueOf(sb2.getValue()));
		l6.setText(String.valueOf(sb3.getValue()));
	}
}
class eaw8
{
	public static void main(String args[])
	{
		myframe f1=new myframe();
	}
}