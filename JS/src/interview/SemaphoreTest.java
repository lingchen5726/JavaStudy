package interview;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private static Semaphore s = new Semaphore(5,true);
    private static final Random r = new Random(10);
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        for (int i=0;i<10;i++) {
            final int j = i;
            cachedPool.submit(new Runnable() {
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    try {
                        s.acquire();
                        System.out.println("Car "+j+" pooled ");
                        Thread.sleep(r.nextInt(5000));
                        System.out.println("Car "+j+" gone ");
                        s.release();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }});
        }
        cachedPool.shutdown();
    }

}
