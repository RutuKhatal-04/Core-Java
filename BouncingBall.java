import java.awt.*;
/*<applet code="BounsingBall.class" height=400 width=350>
</applet>*/
public class BounsingBall extends java.applet.Applet implements Runnable
{
    Thread t;
    int f,y,f1,f2,f3;
    public void init()
    {
            t=new Thread(this);
         t.start();
            f=0;y=0;
            f1=0;
           
           
    }
   
    public void run()
    {
            try{
           
           
            if (f==0)
            {
                        t.sleep(10);
                        y=y+5;
                       
                        repaint();
                       
                        if(f1>=4)
                                    f1=0;
            }
            if(f==1)
            {
                        t.sleep(10);
                        y=y-5;
                        repaint();
                       
                           if(f1>=4)
                                    f1=0;
                       
            }
       
            }catch(Exception e){
            }
           
            run();
           
    }

    public void paint(Graphics g)
    {
    
        if(f==0)
        {
             
            g.fillOval(150,y+10,20,20);
            if(y==400)
            {
                        f1++;
                        if(f1==1)
                        g.setColor(Color.green);
                        else if(f1==2)
                        g.setColor(Color.blue);
                        else if(f1==3)
                        g.setColor(Color.red);
                        else if(f1==4)
                        g.setColor(Color.yellow);
                        f=1;
               }
                                   
        }
        if(f==1)
        {
             
                        g.setColor(Color.yellow);
            g.fillOval(150,y-10,20,20);
            if(y==0)
            {
                        f1++;
            if(f1==1)
            g.setColor(Color.green);
            else if(f1==2)
            g.setColor(Color.blue);
            else if(f1==3)
            g.setColor(Color.red);
            else if(f1==4)
                        g.setColor(Color.yellow);
                       
            f=0;    
            }
           
        }
    }
}
