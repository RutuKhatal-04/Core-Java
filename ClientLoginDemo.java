import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

class ClientLoginDemo extends JFrame implements ActionListener
{
	JTextField txtUser;
	JPasswordField txtPass;
	JButton btnLogin,btnClose;

	Socket client = null;
	DataInputStream in = null;
	PrintStream ps = null;

	ClientLoginDemo()
	{
		super("Login");

		setLayout(null);

		txtUser = new JTextField(10);
		txtUser.setBounds(50,50,100,30);

		txtPass = new JPasswordField(10);
		txtPass.setBounds(50,90,100,30);

		btnLogin = new JButton("Login");
		btnLogin.setBounds(20,140,100,30);

		btnClose = new JButton("Close");
		btnClose.setBounds(130,140,100,30);

		add(txtUser);
		add(txtPass);
		add(btnLogin);
		add(btnClose);
	
		btnLogin.addActionListener(this);
		btnClose.addActionListener(this);

		setSize(300,300);
		setVisible(true);

		try
		{
			client = new Socket("localhost",1234);

			in = new DataInputStream(client.getInputStream());
			ps = new PrintStream(client.getOutputStream());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnLogin)
		{
			try
			{
				ps.println(txtUser.getText());
				ps.println(txtPass.getText());

				String ans  = in.readLine();

				JOptionPane.showMessageDialog(null,ans);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.exit(0);
		}
	}

	public static void main(String args[])
	{
		ClientLoginDemo l = new ClientLoginDemo();
	}
}
