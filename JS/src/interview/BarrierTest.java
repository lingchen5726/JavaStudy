package interview;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarrierTest {

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
        //if 7, will always wait, 
        //also multi checkpoints(cb) could be passed to subTask
        CyclicBarrier cb = new CyclicBarrier(4, new Runnable() {
            public void run() {
                System.out.println(">>>Main task started.");
            }
        });
        new SubTask(cb, "A").start();
        new SubTask(cb, "B").start();
        new SubTask(cb, "C").start();
        new SubTask(cb, "D").start();
    }

}

class SubTask extends Thread {
    private CyclicBarrier cb;
    private String name;
    
    public SubTask(CyclicBarrier cb, String name) {
        // TODO Auto-generated constructor stub
        this.cb = cb;
        this.name = name;
    }
    
    public void run() {
        System.out.println(">Subtask "+name+" started");
        try {
            long randomTime = (long) (Math.random()*5000);
            Thread.sleep(randomTime);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(">Subtask "+name+" finished");
        try {
            cb.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(">Subtask "+name+" returned");
    }
    
}