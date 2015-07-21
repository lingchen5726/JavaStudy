package interview;

import java.util.HashSet;
import java.util.Set;
import java.sql.Driver;

public class Anull {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void haha() {
        System.out.println("haha");
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ((Anull)null).haha();
        short s=1;
        //Strange error if: s = s+(short)1; 
        s=(short)(s+1);
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("A");
        Integer i = (Integer)10;
        int li = (int)i;
    }

}
