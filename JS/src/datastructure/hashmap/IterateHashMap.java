package datastructure.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterateHashMap {

    private IterateHashMap() {
    }
    
    public static void iterEntry(HashMap<String, String> inputMap) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()+":");
        for(Entry<String, String> entry:inputMap.entrySet()) {
            showCurrentEntry(entry);
        }
        System.out.println();
    }

    public static void iterIterator(HashMap<String, String> inputMap) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()+":");
        Iterator<Entry<String, String>> it = inputMap.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, String> entry = (Entry<String, String>)it.next();
            showCurrentEntry(entry);
        }
        System.out.println();
    }

    public static void iterKey(HashMap<String, String> inputMap) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()+":");
        Iterator<String> it = inputMap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next().toString();
            String value = inputMap.get(key);
            System.out.println("Hashmap current entry is: key is "+key+", value is "+value);
        }
        System.out.println();
    }
    
    private static void showCurrentEntry(Entry<String, String> entry) {
        System.out.println("Hashmap current entry is: key is "+entry.getKey()+", value is "+entry.getValue());
    }
    
    public static void printCurrentMethod() {
        //http://lmbj.net/blog/get-method-name-by-stack-trace/
        StackTraceElement[] stes = Thread.currentThread().getStackTrace();
        for (StackTraceElement ste: stes) {
            System.out.println(ste);
        }
        /*
         * java.lang.Thread.getStackTrace(Thread.java:1479)
         * datastructure.hashmap.IterateHashMap.iterEntry(IterateHashMap.java:14)
         * datastructure.hashmap.IterateHashMap.main(IterateHashMap.java:57)
         * 
        System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        */
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
        HashMap<String, String> inputMap = new HashMap<String, String>();
        inputMap.put("Google", "http://www.google.com");
        inputMap.put("Baidu", "http://www.baidu.com");
        inputMap.put("Youtube", "http://www.youtube.com");
        //inputMap.put("Google", "http://www.notgoogle.com");
        
        //keySet.iterator
        //valueSet.iterator
        //entrySet.iterator
        //for (Entry<K,V> e : Map.entrySet) ..
        
        IterateHashMap.iterEntry(inputMap);
        IterateHashMap.iterIterator(inputMap);
        IterateHashMap.iterKey(inputMap);
    }

}
