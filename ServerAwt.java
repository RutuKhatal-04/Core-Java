import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class ServerAwt extends Frame implements ActionListener
{
	TextField t;

	List list;

	Button btnSend,btnExit;

	ServerSocket server = null;
	Socket client = null;

	PrintStream out = null;

	ServerAwt()
	{
		setLayout(new FlowLayout());

		setFont(new Font("Arial",Font.PLAIN,20));

		t = new TextField(20);
		list = new List(5,false);

		btnSend = new Button("Send");
		btnExit = new Button("Exit");

		add(list);
		add(t);
		add(btnSend);
		add(btnExit);

		btnSend.addActionListener(this);
		btnExit.addActionListener(this);

		setSize(400,300);
		setVisible(true);

		try
		{
			server = new ServerSocket(1234);
			
			client = server.accept();

			new Test(client);

			out = new PrintStream(client.getOutputStream());
		}
		catch(Exception e)
		{
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnSend)
		{
			try
			{
				out.println(t.getText());
				t.setText("");
				t.requestFocus();
			}
			catch(Exception e)
			{
			}
		}
		else if(ae.getSource()==btnExit)
		{
			System.exit(0);
		}
	}

	public static void main(String args[])
	{
		ServerAwt a = new ServerAwt();
	}

	class Test extends Thread
	{
		Socket client = null;
	
		DataInputStream in = null;

		Test(Socket client)
		{
			this.client = client;

			start();
		}

		public void run()
		{
			try
			{
				in = new DataInputStream(client.getInputStream());

				while(true)
				{
					list.addItem(in.readLine());
				}
			}
			catch(Exception e)
			{
			}
		}
	}
}