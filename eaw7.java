/*working with scroll bar
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myframe extends JFrame implements AdjustmentListener
{
	TextField t1;
	Scrollbar  sb1;
	Container  c1;
	myframe()
	{
		super("working with scrollbar"); 
		Label l1=new Label("Volume level");
		t1=new TextField("0");
		sb1=new Scrollbar(Scrollbar.HORIZONTAL,10,0,0,100);
		sb1.addAdjustmentListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l1.setBounds(30,30,140,20);
		t1.setEditable(false);
		t1.setBounds(180,30,180,20);
		sb1.setBounds(20,60,200,30);
		c1=getContentPane();
		c1.setLayout(null);
		c1.add(l1);c1.add(t1);c1.add(sb1);
		setSize(400,300);
		setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e1)
	{
		t1.setText(String.valueOf(e1.getValue()));
	}
}
class eaw7
{
	public static void main(String args[])
	{
		myframe f1=new myframe();
	}
}