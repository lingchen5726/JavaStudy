package tjpl;

public class BasicRunnable implements Runnable {

    private String word;
    private int delayMs;
    private boolean flag = true;
    private Thread curThread = null;
    
   public BasicRunnable(String word, int delayMs) {
        this.word = word;
        this.delayMs = delayMs;
        //Following could be risky if it's extended
        curThread = new Thread(this);
        curThread.start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true==flag) {
            System.out.println(word+" ");
            //isAlive();
            try {
                Thread.sleep(delayMs);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void stopRun() {
        this.flag = false;
    }
    
    public void isAlive() {
        if (null!=curThread) {
            System.out.println("CurThread.isAlive() is:"+curThread.isAlive());
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
        BasicRunnable ping = new BasicRunnable("ping", 1000);
        //Move it in the constructor method of BasicRunnable class:    new Thread(ping).start();
        try {
            Thread.sleep(5000);
            ping.stopRun();
            ping.isAlive();
            //Even sleep 1000, still alive, but if sleep 2000, it's not alive.
            Thread.sleep(2000);
            ping.isAlive();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

}
