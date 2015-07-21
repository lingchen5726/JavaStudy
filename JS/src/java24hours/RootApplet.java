package java24hours;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class RootApplet extends JApplet {
     /**
     * FIXME: <A few word of description of what it is about.> 
     */
    private static final long serialVersionUID = 1L;
    int number;

     public void init() {
         number = 625;
     }

     public void paint(Graphics screen) {
        Graphics2D screen2D = (Graphics2D) screen;
        screen2D.drawString("The square root of " + number + " is " + Math.sqrt(number), 5, 50);
     }
}
