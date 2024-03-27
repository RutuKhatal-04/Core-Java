import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;
class timer extends Frame implements Runnable,ActionListener{
	Frame j1;
	Button b1,b2;
	TextField t1;
	Thread t;
	Thread t3;
	int i=0,j=0,k;
	boolean flag;
	boolean on;
	timer()
	{
		on=false;
		t=new Thread(this);
		t3=new Thread(this);
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
		t.start();
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=e.getActionCommand();
		try
		{
		if(s1.equals("Start"))
		{
			
			System.out.println("Call of Start");
			flag=true;
			
		}
		if(s1.equals("Stop"))
		{
			
			System.out.println("Call of Stop");
			flag=false;
		}
		if(flag==true)
		{
			on=true;
			t.start();
			
			
		}
		if(flag==false)
		{
			on=false;
			
		}
		}catch(Exception eee){}
	}
	public void run()
	{
		while(on)
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
}
class timer4{

	public static void main(String []args)
	{
		int i,j=0,k=0;
		timer t2=new timer();
		
		/*try{
			t2.t3.start();
			t2.t3.join();
		}
		catch(InterruptedException e1)
		{
		}
		*/
	
			
	}
} 
				