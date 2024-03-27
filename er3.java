import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class frame extends Jframe implements AdjustmentListener
{
	TextField t1;
	Scrollbar sb1;
	Container c1;
	frame()
	{
		
		super("Working with scrollbar");
		Label l1=new Label("Volume Level");
		t1=new TextField("0");
		sb1=new Scrollbar(Scrollbar.HORIZONTAL,5,9,0,50);
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
	public void adjustementValueChanged(AdjustmentEvent e1)
	{
		t1.setText(String.valueOf(e1.getValue()));
	}
}
class er3
{
	public static void main(String args[])
	{
		frame f1 =new frame();
	}
} 