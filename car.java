import java.awt.*;
/*<applet code="car.class" height=400 width=350>
</applet>*/
public class car extends java.applet.Applet implements Runnable
{
    Thread t;
    int f,x;
    public void init()
    {
            t=new Thread(this);
         t.start();
            f=0;x=0;
           
           
    }
   
    public void run()
    {
            try{
           
            if (f==0)
            {
                        t.sleep(200);
                        f=1;
                        x=x+5;
                        repaint();
            }
            else
            {
                        t.sleep(200);
                        x=x+5;
                                                repaint();
                        f=0;
                       
            }
            }catch(Exception e){
            }
            run();
           
    }
   

    public void paint(Graphics g)
    {
     
        g.drawLine(0,120,350,120);
        g.drawLine(0,200,350,200);
        if (f==0)
            {
                        g.setColor(Color.red);
                        g.fillRect(x,130,20,20);
                 g.fillRect(x+2,170,20,20);
                        f=1;
            }
            else
            {          g.setColor(Color.blue);
                        g.fillRect(x+5,130,20,20);
                 g.fillRect(x,170,20,20);
                       
                        f=0;
            }
    }
}
