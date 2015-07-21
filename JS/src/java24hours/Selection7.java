package java24hours;

import java.util.Calendar;

public class Selection7 {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    void switch1() {
        char grade='B';
        switch (grade) {
            case 'A':
                System.out.println("You got an A. Great job!");
                break;
            case 'B':
                System.out.println("You got a B. Good work!");
                //If don't break, the next case will suppose to be met and exit until there is a break;
                //break;
            case 'C':
                System.out.println("You got a C. What went wrong?");
                break;
            default:
                System.out.println("You got an F. You’ll do well in Congress!");
                break;
        }

    }
    
    static void showTime() {
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int year = now.get(Calendar.YEAR);
        
        if (hour<12) {
            System.out.print("Good morning.\n");
        } else if (hour<17) {
            System.out.print("Good afternoon.\n");
        } else {
            System.out.print("Good evening.\n");
        }
        
        //minute
        System.out.print("It's");
        if (minute!=0) {
            System.out.print(" "+minute+" ");
            System.out.print(1==minute?"minute":"minutes");
            System.out.print(" past ");
        }
        
        //hour
        System.out.print(hour>12?hour-12:hour);
        System.out.print(" o'clock on "+month+"."+day+", "+year);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        showTime();
    }

}
