package jcip;

public class NoVisibility {
    private static volatile boolean ready = false;
    private static int number = 1;
    
    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
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
        new ReaderThread().start();
        number = 4;
        ready = true;
    }

}
