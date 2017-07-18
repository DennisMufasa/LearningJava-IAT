package javaprogramming_dennis;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class Lesson13_Applets extends JApplet {

    public void init() {
        System.out.println("Applet is initialized");
    }

    public void start() {
        System.out.println("Applet started");
    }

    public void paint(Graphics g) {
         g.setColor(Color.RED);
        g.drawString("Dennis",130,50);
        g.drawRect(50, 10, 130, 60);//x-50,y-10 length-130, width-60
        g.fillRect(100, 100, 130, 180);
        
        /*
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);
        g.fillOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);
        g.drawOval(85, 100, 30, 30);
        g.fillArc(60, 125, 80, 40, 180, 180);
        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
*/
        /* setBackground(Color.WHITE);
        setSize(500, 500);
        g.setColor(Color.BLACK);
        g.fillRect(100, 100, 400, 400);
        for (int i = 100; i <= 400; i += 100) {
            for (int j = 100; j <= 400; j += 100) {
                g.clearRect(i, j, 50, 50);

            }
        }
        for (int i = 150; i <= 450; i += 100) {
            for (int j = 150; j <= 450; j+=100) {
                g.clearRect(i, j, 50, 50);
            }

            }*/
    }

    public void stop() {
        System.out.println("Applet stopped");
    }

    public void destroy() {
        System.out.println("Applet is destroyed");
    }
}
