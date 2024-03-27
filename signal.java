import java.awt.*;
import java.awt.event.*;

public class signal extends Frame implements Runnable {
    private int r, gr, y, i;
    private Thread t;

    public signal() {
        r = 1;
        gr = 0;
        y = 0;

        t = new Thread(this);
        t.start();

        setSize(300, 500);
        setVisible(true);
    }

    public void run() {
        try {
            for (i = 60; i >= 1; i--) {
                t.sleep(500);
                if (i >= 20 && i <= 60) {
                    r = 1;
                    gr = 0;
                    y = 0;
                    repaint();
                }
                if (i >= 10 && i < 20) {
                    r = 0;
                    gr = 1;
                    y = 0;
                    repaint();
                }
                if (i >= 1 && i < 10) {
                    r = 0;
                    gr = 0;
                    y = 1;
                    repaint();
                }
            }
            if (i == 0) {
                run();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(100, 100, 100, 300); // Background

        g.setColor(Color.GRAY);
        g.fillOval(100, 100, 100, 100); // Red light
        g.fillOval(100, 225, 100, 100); // Yellow light
        g.fillOval(100, 350, 100, 100); // Green light

        if (r == 1) {
            g.setColor(Color.RED);
            g.fillOval(100, 100, 100, 100); // Red light
        }
        if (y == 1) {
            g.setColor(Color.YELLOW);
            g.fillOval(100, 225, 100, 100); // Yellow light
        }
        if (gr == 1) {
            g.setColor(Color.GREEN);
            g.fillOval(100, 350, 100, 100); // Green light
        }
    }

    public static void main(String[] args) {
    signal s1 = new signal();
        s1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
