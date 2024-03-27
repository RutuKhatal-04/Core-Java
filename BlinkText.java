import java.awt.*;
import java.awt.event.*;
public class BlinkText extends Frame implements Runnable
{
            Thread t;
            Label l1;
            int f;
            public BlinkText()
            {
                        t=new Thread(this);
                        t.start();
                        setLayout(null);
                        l1=new Label("Hello JAVA");
                        l1.setBounds(100,100,100,40);
                        add(l1);
                        setSize(300,300);
                        setVisible(true);
                        f=0;
            }
            public void run()
            {
                        try
                        {
                                    if(f==0)
                                    {
                                                t.sleep(200);
                                                l1.setText("");
                                                f=1;
                                    }
                                    if(f==1)
                                    {
                                                t.sleep(200);
                                                l1.setText("Hello Java");
                                                f=0;
                                    }
                        }catch(Exception e)
                        {
                                    System.out.println(e);
                        }
                        run();
            }
            public static void main(String args[])
            {
                        new BlinkText();
            }
}
