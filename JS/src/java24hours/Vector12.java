package java24hours;

import java.util.Collections;
import java.util.Vector;

public class Vector12 {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private String[] strBase = {"a", "d", "f", "z"};
    private Vector<String> v = new Vector<String>();
    
    public Vector12(String[] added) {
        for (String s: strBase) {
            v.add(s);
        }
        for (String s: added) {
            v.add(s);
        }
        Collections.sort(v);
        System.out.println("The sorted vector is:");
        for (String s:v) {
            System.out.println(s);
        }
    }
    
    static void testVector() {
        Vector<String> v = new Vector<String>(3);
        v.add("0");
        v.add("1");
        v.add("2");
        for (String s:v) {
            System.out.println(s);
        }
        if (v.get(2).contains("2")) {
            System.out.println("2 found at v.get(2)");
        }
        v.remove(0);
        v.remove("2");
        for (int i=0;i<v.size();i++) {
            System.out.println("v.get("+i+") is "+v.get(i));
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //testVector();
        Vector12 v12 = new Vector12(args);
    }

}
