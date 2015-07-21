package interview;

public class Singleton {
    private static Singleton instance = null;
    private static final Object locker = new Object();
    
    private Singleton() {
        System.out.println("instance created");
    }
    
    public static synchronized Singleton getInstance() {
        if (null==instance) {
            System.out.println(Thread.currentThread().getName()+" first created the instance");
            instance = new Singleton();
        } else {
            System.out.println(Thread.currentThread().getName()+" got existing instance");
        }
        
        return instance;
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
        //Singleton a = Singleton.getInstance();
        //Singleton b = Singleton.getInstance();
        //System.out.println(a.equals(b));
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Singleton a = Singleton.getInstance();
                System.out.println(a.toString());
            }}, "ThreadA").start();
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Singleton b = Singleton.getInstance();
                System.out.println(b.toString());
            }
            
        }, "ThreadB").start();
    }

}
