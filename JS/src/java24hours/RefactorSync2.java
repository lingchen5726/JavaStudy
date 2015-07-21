package java24hours;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RefactorSync2 extends RefactorSync {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public RefactorSync2() {
        System.out.println("Id: "+getNextId());
    }
    
    public synchronized int getNextId() {
        return super.getNextId();
    }

    public synchronized void setNextId(int nextId) {
        super.setNextId(nextId);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //If some existing unsync object implements from an interface, we can create a general synchronized wrapper for them to become synchronized class 
        Map<String, String> unsyncMap = new HashMap<String, String>();
        Map<String, String> syncMap = Collections.synchronizedMap(unsyncMap);
    }

}
