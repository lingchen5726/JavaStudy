package adapter;

import bridge.Protect;
import bridge.testProtect;


public class Client {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void testAdapter() {
        Player jordan = new NativePlayer("Michael Jordan");
        Player yaoming = new Translator("姚明");
        
        jordan.attack();
        yaoming.defense();
    }
    
    public static void testProtect() {
        Protect p = new Protect("pub", "pro", "pri");
        //Even you import the package, you can't access the protected method p.mProtect()
        //Only extended class and the class in same package could access p.mProtect();
        p.mPublic();
        //But why the extended testProtect can't access the protected method? Strange.
        testProtect tp = new testProtect("pub", "pro", "pri");
        tp.mPublic();
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        testAdapter();
        //testProtect();
    }

}
