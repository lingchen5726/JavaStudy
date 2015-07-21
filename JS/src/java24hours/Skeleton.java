package java24hours;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;
import javax.swing.JButton;

public class Skeleton extends JApplet {
    String greeting;
    
    public void paint(Graphics screen) {
        Graphics2D screen2D = (Graphics2D) screen;
        // display statements go here
        screen2D.drawString(greeting, 25, 50);
    }
    
    public void init() {
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JButton run = new JButton("Run");
        add(run);
        greeting = "Saluton mondo!";
    }
    
}
