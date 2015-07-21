package tjpl;

import java.util.Date;

public class Exe145{
    private static Date start = null;
    private Thread curThread = null;
    
    private synchronized void showElaspedTime(int seconds) {
        while (true) {
            try {
                wait(1000*seconds);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Date cur = new Date();
            System.out.println(curThread.getName()+":"+(cur.getTime()-start.getTime())+" milliseconds passed");
            notifyAll();
        }
    }
    
    public Exe145(final int seconds, String threadName) {
        start = new Date();
        Runnable service = new Runnable() {
            public void run() {
                showElaspedTime(seconds);
            }
        };
        curThread = new Thread(service, threadName);
        curThread.start();
    }

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Exe145 r1 = new Exe145(1, "r1");
        Exe145 r15 = new Exe145(15, "r15");
        Exe145 r7 = new Exe145(7, "r7");
    }
    /*
     *  1000 milliseconds passed
        2001 milliseconds passed
        3002 milliseconds passed
        4003 milliseconds passed
        5004 milliseconds passed
        6005 milliseconds passed
        7006 milliseconds passed
        8007 milliseconds passed
        9008 milliseconds passed
        10010 milliseconds passed
        11011 milliseconds passed
        12012 milliseconds passed
        13013 milliseconds passed
     * */
}
