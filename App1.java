import java.applet.*;
import java.awt.*;
public class App1 extends Applet
{
	String str;
	public void init()
	{
		str="Friends Computer Academy";
	}
	public void paint(Graphics g)
	{
		g.drawString(str,100,50);
	}
}