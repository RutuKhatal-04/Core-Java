import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;
public class timer extends Frame implements Runnable,ActionListener{
	Frame j1;
	Button b1,b2;
	TextField t1;
	Thread t;
	int i=0,j=0,k;
	boolean flag;
	timer()
	{
		t=new Thread(this);
		j1=new Frame();
		b1=new Button("Start");
		b2=new Button("Stop");
		t1=new TextField("00:00:00");
		j1.setLayout(new GridLayout(2,1));
		j1.add(b1);j1.add(b2);j1.add(t1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		j1.setSize(400,300);
		j1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=e.getActionCommand();
		if(s1.equals("Start"))
		{
			flag=true;
			
		}
		if(s1.equals("Stop"))
		{
			flag=false;
		}
		if(flag==true)
		{
			t.start();
			t.resume();
		}
		if(flag==false)
		{
			t.suspend();
		}
	}
	public void run()
	{
		for(k=0;k<60;k++)
		{
			try{
				t1.setText(i+":"+j+":"+k);
				Thread.sleep(1000);
				if(k==59)
				{
					k=0;
					j++;
					if(j==59)
					{
						j=0;
						i++;
					}
				}
			}
			catch(InterruptedException e)
			{
			}
	
		}
	}
}
class timer1{

	public static void main(String []args)
	{
		int i,j=0,k=0;
		timer t2=new timer();
		timer t3=new timer();
		t3.start();
		try{
			t3.t.join();
			t1.setText(i+":"+j+":"+k);
			Thread.sleep(1000);
			if(k==59)
			{
				k=0;
				j++;
				if(j==59)
				{
					j=0;
					i++;
				}
			}
		}
		catch(InterruptedException e)
		{
		}
	
			
	}
} 
					