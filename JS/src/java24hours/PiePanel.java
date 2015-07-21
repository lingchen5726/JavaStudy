package java24hours;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class PiePanel extends JPanel {
    private PieSlice[] slice;
    private int current = 0;
    private float totalSize = 0;
    private Color background;
    
    public PiePanel(int sliceCount) {
        slice = new PieSlice[sliceCount];
        background = getBackground();
    }
    
    public void addSlice(Color sColor, float sSize, String sName) {
        if (current <= slice.length) {
            slice[current] = new PieSlice(sColor, sSize, sName);
            totalSize += sSize;
            current++;
        }
    }
    
    public void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        Graphics2D comp2D = (Graphics2D) comp;
        int width = getSize().width - 10;
        int height = getSize().height - 15;
        int xInset = 5;
        int yInset = 5;
        if (width<5) {
            xInset = width;
        }
        if (height<5) {
            yInset = height;
        }
        comp2D.setColor(background);
        comp2D.fillRect(0, 0, getSize().width, getSize().height);
        comp2D.setColor(Color.lightGray);
        Ellipse2D.Float pie = new Ellipse2D.Float(xInset, yInset, width, height);
        comp2D.fill(pie);
        float start = 0;
        for (int i=0;i<slice.length;i++) {
            float pi = 3.1415926535897F;
            float extent = slice[i].size*360F / totalSize;
            comp2D.setColor(slice[i].color);
            Arc2D.Float drawSlice = new Arc2D.Float(xInset, yInset, width, height, start, extent, Arc2D.Float.PIE);
            start += extent;
            comp2D.fill(drawSlice);
            
            float radians = 2*pi*(start+extent/2)/360;
            float x = (float) (width/2 + width*Math.cos(radians)/2);
            float y = (float) (height/2 + width*Math.sin(radians)/2);
            comp2D.setColor(Color.BLACK);
            comp2D.drawString(slice[i].name, x, y);
            
        }
    }
}

class PieSlice {
    Color color = Color.lightGray;
    float size = 0;
    String name = "";
    
    PieSlice(Color pColor, float pSize, String pName) {
        color = pColor;
        size = pSize;
        name = pName;
    }
}