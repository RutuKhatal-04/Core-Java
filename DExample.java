import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DExample{
	private static JDialog d;
	DExample(){
		JFrame f=new JFrame();
		d=new JDialog(f,"Dialog Example",true);
		d.setLayout(new FlowLayout());
		JButton b=new JButton("ok");
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				DExample.d.setVisible(false);
			}
		});
		d.add(new JLabel("click button to continue"));
		d.add(b);
		d.setSize(300,300);
		d.setVisible(true);
	}
	public static void main(String args[])
	{
		new DExample();
	}
}