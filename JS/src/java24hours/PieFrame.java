package java24hours;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PieFrame extends JFrame {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
        Color uneasyBeingGreen = new Color(0xCC, 0xCC, 0x99);
        Color zuzusPetals = new Color(0xCC, 0x66, 0xFF);
        Color zootSuit = new Color(0x66, 0x66, 0x99);
        Color sweetHomeAvocado = new Color(0x66, 0x99, 0x66);
        Color shrinkingViolet = new Color(0x66, 0x66, 0x99);
        Color miamiNice = new Color(0x33, 0xFF, 0xFF);
        Color inBetweenGreen = new Color(0x00, 0x99, 0x66);
        Color norwegianBlue = new Color(0x33, 0xCC, 0xCC);
        Color purpleRain = new Color(0x66, 0x33, 0x99);
        Color freckle = new Color(0x99, 0x66, 0x33);

    public PieFrame() {
        super("Pie Graph");
        setLookAndFeel();
        setSize(320, 330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        PiePanel pie = new PiePanel(10);
        pie.addSlice(uneasyBeingGreen, 1337, "China");
        pie.addSlice(zuzusPetals, 1189, "India");
        pie.addSlice(zootSuit, 311, "U.S.");
        pie.addSlice(sweetHomeAvocado, 246, "");
        pie.addSlice(shrinkingViolet, 203, "");
        pie.addSlice(miamiNice, 187, "");
        pie.addSlice(inBetweenGreen, 166, "");
        pie.addSlice(norwegianBlue, 159, "");
        pie.addSlice(purpleRain, 139, "");
        pie.addSlice(freckle, 127, "");
        add(pie);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void testCos() {
        double pi = 3.1415926535897D;
        double du = 90;
        double co = Math.cos(du);
        double si = Math.sin(du);
        System.out.println("co:"+co+",si:"+si);
        co = Math.cos(du*2*pi/360);
        si = Math.sin(du*2*pi/360);
        System.out.println("co:"+co+",si:"+si);
        
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PieFrame pf = new PieFrame();
        //testCos();
    }

}
