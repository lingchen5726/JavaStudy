package interview.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

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
        ArrayList<String> as = new ArrayList<String>();
        as.add("A");
        as.add("O");
        as.add("E");
        as.add("I");
        as.add("U");
        System.out.println(as.size());
        Iterator<String> iter = as.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
            //The collection interface defines that iter.remove will remove current item and safe in single thread.
            iter.remove();
        }
        System.out.println(as.size());
        
    }

}
