package interview;

public class InterruptTest {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        MyThread mt = new MyThread();
        mt.start();
        Thread.sleep(3000);
        mt.interrupt();
    }

}

class MyThread extends Thread {
    int i=0;
    public void run() {
        while (true) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println("Interrupt caught");
                return;
            }
            i++;
        }
    }
}