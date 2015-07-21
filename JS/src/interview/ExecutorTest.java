package interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void testFixedPool() {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i=0;i<7;i++) {
            pool.submit(new MyRunnableTest());
        }
        pool.shutdown();
    }
    
    public static void testSinglePool() {
        ExecutorService singlePool = Executors.newSingleThreadExecutor();
        for (int i=0;i<3;i++) {
            singlePool.submit(new ThreadTest());
        }
        singlePool.shutdown();
    }
    
    public static void testCachedPool() {
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        for (int i=0;i<3;i++) {
            cachedPool.submit(new MyRunnableTest());
        }
        cachedPool.shutdown();
    }
    
    public static void testScheduledPool() {
        ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(5);
        for (int i=0;i<3;i++) {
            scheduledPool.submit(new ThreadTest());
        }
        for (int j=0;j<2;j++) {
            scheduledPool.schedule(new ThreadTest(), 1000, TimeUnit.MILLISECONDS);
        }
        scheduledPool.shutdown();
    }

    public static void testSingleScheduledPool() {
        ScheduledExecutorService singleScheduledPool = Executors.newSingleThreadScheduledExecutor();
/*        for (int i=0;i<3;i++) {
            singleScheduledPool.submit(new ThreadTest());
        }
*/        for (int j=0;j<2;j++) {
            singleScheduledPool.schedule(new ThreadTest(), 5000, TimeUnit.MILLISECONDS);
        }
        singleScheduledPool.shutdown();
    }

    public static void testCallable() throws InterruptedException, ExecutionException {
        ExecutorService fixedPool = Executors.newFixedThreadPool(2);
        Future fa = fixedPool.submit(new MyCallable("A"));
        Future fb = fixedPool.submit(new MyCallable("B"));
        System.out.println(fa.get().toString());
        System.out.println(fb.get().toString());
        fixedPool.shutdown();
    }
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // TODO Auto-generated method stub
        //testFixedPool();
        //testSinglePool();
        //testCachedPool();
        //testScheduledPool();
        //testSingleScheduledPool();
        testCallable();
    }

}

class MyCallable implements Callable {
    private String old;
    
    MyCallable(String old) {
        this.old = old;
    }
    
    @Override
    public Object call() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Entry of "+Thread.currentThread().getName());
        Thread.sleep(2000);
        return Thread.currentThread().getName()+"returned: "+old+" +new Conntent";
    }
    
}

class MyRunnableTest implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}

class ThreadTest extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" exit");
    }
}