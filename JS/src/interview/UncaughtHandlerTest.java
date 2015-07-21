package interview;

public class UncaughtHandlerTest implements Thread.UncaughtExceptionHandler{

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
        Thread.currentThread().setUncaughtExceptionHandler(new UncaughtHandlerTest());
        int a= 1/0;
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        // TODO Auto-generated method stub
        System.out.println("Something wrong uncaught");
        e.printStackTrace();
    }

}
