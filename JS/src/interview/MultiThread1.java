package interview;

public class MultiThread1 {

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
        RunnableTest work = new RunnableTest();
        new Thread(work, "").start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        synchronized (work) {
            System.out.println("1st");
            try {
                work.wait(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("4th");
        }
    }

    
}

class RunnableTest implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        /*
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */
        synchronized(this) {
            System.out.println("2nd");
            notifyAll();
            System.out.println("3rd");
        }
    }
    
}