package tjpl;

public class DeadlockPartner {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private String name;
    private DeadlockPartner partner;
    private static Object locker = new Object();
    
    public DeadlockPartner(String name) {
        this.name = name;
    }
    
    public void setPartner(DeadlockPartner partner) {
        this.partner = partner;
    }
    
    public void hug() {
        synchronized (locker) {
            System.out.println(Thread.currentThread().getName()+": "+name+".hug() trying to invoke "+partner.name+".hugback()");
            partner.hugback();
        }
    }
    
    public void hugback() {
        synchronized (locker) {
            System.out.println(Thread.currentThread().getName()+": "+name+".hugback()");
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final DeadlockPartner a = new DeadlockPartner("A");
        final DeadlockPartner b = new DeadlockPartner("B");
        a.setPartner(b);
        b.setPartner(a);
        /*
         * a.hug()
         * b.hug()
         * This will work but if using Thread, deadlock.
         * */
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                a.hug();
            }}, "ThreadA").start();
        
        new Thread(new Runnable(){

            @Override
            public void run() {
                // TODO Auto-generated method stub
                b.hug();
            }}, "ThreadB").start();
    }

}
