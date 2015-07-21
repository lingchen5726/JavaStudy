package iterator;

import java.util.ArrayList;

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
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("------------------------");
        System.out.println("This is home-made process");
        ConcreteAggregate a = new ConcreteAggregate();
        a.add("xing li");
        a.add("shou piao yuan");
        a.add("xiao tou");
        
        Iterator iter = a.createIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next()+", qing mai piao.");
        }
        
        System.out.println("------------------------");
        System.out.println("This is standard process");
        
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Luggage");
        arr.add("Seller");
        arr.add("Thief");
        java.util.Iterator<String> jiter = arr.iterator();
        while(jiter.hasNext()) {
            System.out.println(jiter.next()+", please buy ticket.");
        }
    }

}
