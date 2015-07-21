package java24hours;

import java.awt.FlowLayout;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class JButtonGroup13 extends JFrame {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    
    public JButtonGroup13() {
        super();
        setTitle("First frame");
        setLookAndFeel();
        setSize(320, 640);
        //pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout();
        //If we ignore the following pane.setLayout(fl), only pauseButton will be shown by fitting the whole frame.
        setLayout(fl);
        addButtonGroup();
        addComboBox();
        addTextArea();
        addPanel();
        add(new ClockPanel("c"));
        setVisible(true);
    }
    
    private void addButtonGroup() {
        JCheckBox jumboSize = new JCheckBox("Jumbo Size", true);
        JCheckBox beef = new JCheckBox("Beef", false);
        JCheckBox lamb = new JCheckBox("Lamp", false);
        JCheckBox fish = new JCheckBox("Fish", true);
        ButtonGroup meals = new ButtonGroup();
        //meals.add(jumboSize);
        meals.add(beef);
        meals.add(lamb);
        meals.add(fish);
        add(jumboSize);
        add(beef);
        add(lamb);
        add(fish);
    }
    
    private void addComboBox() {
        JComboBox profession = new JComboBox();
        profession.addItem("Butcher");
        profession.addItem("Baker");
        profession.addItem("Candlestick maker");
        profession.addItem("Fletcher");
        profession.addItem("Fighter");
        profession.addItem("Technical writer");
        //This is be set before add
        profession.setEditable(true);
        add(profession);
    }
    
    
    private void addTextArea() {
        //JTextArea comments = new JTextArea(8, 40);
        JTextArea comments = new JTextArea("I should have been a pair\n"
                + "of ragged claws.", 10, 25);
        add(comments);
    }
    
    private void addPanel() {
        JPanel panel = new JPanel();
        FlowLayout fl = new FlowLayout();
        //If we ignore the following pane.setLayout(fl), only pauseButton will be shown by fitting the whole frame.
        panel.setLayout(fl);
        JCheckBox liangpi = new JCheckBox("Liangpi", false);
        JCheckBox yu = new JCheckBox("Yu", false);
        JCheckBox rjm = new JCheckBox("Rou Jia Mo", true);
        ButtonGroup meals = new ButtonGroup();
        //meals.add(jumboSize);
        meals.add(liangpi);
        meals.add(yu);
        meals.add(rjm);
        panel.add(liangpi);
        panel.add(yu);
        panel.add(rjm);
        add(panel);
        
    }
    
    class ClockPanel extends JPanel {
        public ClockPanel() {
            super();
            Date date = new Date();
            String strTime = date.toString();
            JLabel current = new JLabel(strTime);
            add(current);
        }
        
        public ClockPanel(String a) {
            super();
            if ("c".equals(a)) {
                String currentTime = getTime();
                JLabel time = new JLabel("Time: ");
                JLabel current = new JLabel(currentTime);
                add(time);
                add(current);
            }
        }

        private final String getTime() {
            // TODO Auto-generated method stub
            String time="";
            Calendar now = Calendar.getInstance();
            int hour = now.get(Calendar.HOUR);
            int minute = now.get(Calendar.MINUTE);
            int second = now.get(Calendar.SECOND);
            int year = now.get(Calendar.YEAR);
            int month = now.get(Calendar.MONTH);
            int day = now.get(Calendar.DAY_OF_MONTH);
            
            String monthName = "";
            switch (month) {
            case 1:
                monthName = "JAN";
                break;
            case 2:
                monthName = "FEB";
                break;
            case 3:
                monthName = "MAR";
                break;
            case 4:
                monthName = "APR";
                break;
            case 5:
                monthName = "MAY";
                break;
            case 6:
                monthName = "JUN";
                break;
            case 7:
                monthName = "JUL";
                break;
            case 8:
                monthName = "AUG";
                break;
            case 9:
                monthName = "SEP";
                break;
            case 10:
                monthName = "OCT";
                break;
            case 11:
                monthName = "NOV";
                break;
            case 12:
                monthName = "DEC";
                break;
            default:
                break;
            }
            time = monthName+" "+day+","+year+" "+hour+":"+minute+":"+second;
            
            return time;
        }
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
        new JButtonGroup13();
    }

}
