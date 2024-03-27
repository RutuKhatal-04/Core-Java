import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myframe extends JFrame implements ActionListener,ItemListener
{
	JTextField t1;
	JLabel l1,l2;
	String clist[]={"Nasik","Pune","Mumbai","Nagpur","Satpur","Rampur"};
	JComboBox ch1;
	JRadioButton rb1,rb2,rb3;
	ButtonGroup bg1;
	JCheckBox cb1,cb2,cb3,cb4,cb5,cb6;
	String status;
	JButton b1;
	Container c1;
	JPanel p1,p2;
	myframe()
	{
		super("working with combobox &calling one form from another");
		l1=new JLabel("Name");
		t1=new JTextField();	
		l2=new JLabel("City");
		ch1=new JComboBox(clist);
		p1=new JPanel();
		p1.setLayout(new GridLayout(3,1));
		rb1=new JRadioButton("Indian");	
		rb2=new JRadioButton("Foreigner");
		rb3=new JRadioButton("NRI");
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		rb3.addItemListener(this);
		p1.add(rb1);p1.add(rb2);p1.add(rb3);
		bg1=new ButtonGroup();
		bg1.add(rb1);bg1.add(rb2);bg1.add(rb3);
		p1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue),"status"));
		p2= new JPanel();
		p2.setLayout(new GridLayout(3,2));
		cb1=new JCheckBox("Shoping");
		cb2=new JCheckBox("Eating");
		cb3=new JCheckBox("Chating");
		cb4=new JCheckBox("Singing");
		cb5=new JCheckBox("Reading");
		cb6=new JCheckBox("Playing");
		p2.add(cb1);p2.add(cb2);p2.add(cb3);
		p2.add(cb4);p2.add(cb5);p2.add(cb6);
		p2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.pink),"Hobbies"));
		b1=new JButton("OK");
		b1.addActionListener(this);
		l1.setBounds(20,40,60,20);
		t1.setBounds(90,40,120,20);
		l2.setBounds(20,70,60,20);
		ch1.setBounds(90,70,100,20);
		p1.setBounds(20,100,200,80);
		p2.setBounds(230,100,200,90);
		b1.setBounds(200,220,100,30);
		c1=getContentPane();
		c1.setLayout(null);
		c1.add(l1);c1.add(t1);	
		c1.add(l2);c1.add(ch1);
		c1.add(p1);c1.add(p2);
		c1.add(b1);
		setSize(600,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent a1)
	{
		String s1=a1.getActionCommand();
		String sname=t1.getText();
		String city=(String)ch1.getSelectedItem();
		String hobbies[]=new String[6];
		
		if(cb1.isSelected())
		{
			hobbies[0]=cb1.getText();
		}
		if(cb2.isSelected())
		{
			hobbies[1]=cb2.getText();
		}
		if(cb3.isSelected())
		{
			hobbies[2]=cb3.getText();
		}
		if(cb4.isSelected())
		{
			hobbies[3]=cb4.getText();
		}
		if(cb5.isSelected())
		{
			hobbies[4]=cb5.getText();
		}
		if(cb6.isSelected())
		{
			hobbies[5]=cb6.getText();
		}
		if(s1.equals("OK"))
		{
		if(cb1.isSelected()==false && cb2.isSelected()==false && cb3.isSelected()==false && cb4.isSelected()==false && cb5.isSelected()==false && cb6.isSelected()==false)
		{
			JOptionPane.showMessageDialog(null,"Select hobbies","Title",JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			new callf(sname,city,status,hobbies);
		}
		}
	}
	public void itemStateChanged(ItemEvent i1)
	{
		status=((JRadioButton)i1.getSource()).getText();
	}	
}
class eaw11
{
	public static void main(String args[]) 
	{
		myframe f1=new myframe();
	}
}