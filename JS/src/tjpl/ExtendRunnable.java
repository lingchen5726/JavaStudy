package tjpl;

public class ExtendRunnable extends BasicRunnable {

    /*
    public ExtendRunnable(String word, int delayMs) {
        super(word, delayMs);
        // TODO Auto-generated constructor stub
    }
    */

    public ExtendRunnable(String word, int delayMs) {
        super(word, delayMs*2);
        
        // TODO Auto-generated constructor stub
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
        ExtendRunnable er = new ExtendRunnable("pong", 1000);
    }

}
