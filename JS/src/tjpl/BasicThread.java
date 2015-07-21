package tjpl;

public class BasicThread extends Thread{

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private String word;
    private int delay;
    
    public BasicThread(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
        BasicThread ping = new BasicThread("ping", 500);
        BasicThread pong = new BasicThread("pong", 500);
        ping.run();
        pong.run();
        */
        Thread currentThread = Thread.currentThread();
        System.out.println("currentThread is id:"+currentThread.getId()+", name:"+currentThread.getName()+", priority:"+currentThread.getPriority());
        
        Thread ping = new BasicThread("ping", 500);
        Thread pong = new BasicThread("pong", 500);
        ping.start();
        pong.start();
        
        try {
            Thread.sleep(5000);
            ping.interrupt();
            pong.interrupt();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (;;) {
            System.out.println(this.getName()+":"+word+", priority:"+this.getPriority());
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
