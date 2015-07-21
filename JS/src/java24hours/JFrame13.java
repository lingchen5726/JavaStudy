package java24hours;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JFrame13 extends JFrame {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public JFrame13() {
        super();
        setTitle("First frame");
        setLookAndFeel();
        setSize(350, 125);
        //pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout();
        //If we ignore the following pane.setLayout(fl), only pauseButton will be shown by fitting the whole frame.
        setLayout(fl);
        JButton okButton = new JButton("OK");
        add(okButton);
        JButton stopButton = new JButton("Stop");
        add(stopButton);
        JButton pauseButton = new JButton("Pause");
        add(pauseButton);
        //This 2 statements are more like println, show 1,2,3... println.
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JLabel pageLabel = new JLabel("Web page address: ", JLabel.RIGHT);
        JTextField pageAddress = new JTextField(20);
        JTextField country = new JTextField("US", 29);
        add(pageLabel);
        add(pageAddress);
        add(country);
        country.setText("Separate Customs Territory of Taiwan, Penghu, Kinmen,and Matsu");
        //If we write it before the 3 buttons, the 3 buttons won't be shown.
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame13 j = new JFrame13();
    }

}
