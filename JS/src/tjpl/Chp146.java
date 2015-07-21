package tjpl;

public class Chp146 extends Thread {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private static boolean yieldFlag;
    private static int times;
    private String toPrint;
    
    public Chp146(String toPrint) {
        this.toPrint = toPrint;
    }
    
    public void run() {
        for (int i=0;i<times;i++) {
            System.out.println(toPrint);
            if (yieldFlag) {
                Thread.yield();
            }
        }
        
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        yieldFlag = new Boolean(args[0]).booleanValue();
        times = Integer.parseInt(args[1]);
        for (int i=2;i<args.length;i++) {
            new Chp146(args[i]).start();
        }
    }

}
