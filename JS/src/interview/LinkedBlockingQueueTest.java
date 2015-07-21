package interview;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTest {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static final LinkedBlockingQueue queue = new LinkedBlockingQueue(2);
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Thread(new Runnable(){

            @Override
            public void run() {
                // TODO Auto-generated method stub
                for (int i=0;i<2;i++) {
                    try {
                        queue.put("A");
                        queue.put("B");
                        queue.put("C");
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }}, "insert").start();
        
        new Thread(new Runnable(){

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                while(true) {
                    if (queue.size()>0) {
                        System.out.println(queue.remove());
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    } else {
                        break;
                    }
                }
            }}, "print").start();
        
    }

}
