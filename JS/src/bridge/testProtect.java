package bridge;

public class testProtect extends Protect{

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    
    
    public testProtect(String pub, String pro, String pri) {
        super(pub, pro, pri);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        testProtect t = new testProtect("Public", "Protected", "Private");
        t.mPublic();
        t.mProtect();
        
        Protect p = new Protect("pub", "pro", "pri");
    }

}
