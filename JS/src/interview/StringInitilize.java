package interview;

public class StringInitilize {

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
        String s = "null";
        int i = 0;
        //If you want to print, initialize it.
        System.out.println("s="+s+i);
        System.out.println("5"+2);
        String s1 = "Hello";
        String s2 = "He"+new String("llo");
        System.out.println("s1.equals(s2): "+s1.equals(s2));
        System.out.printf("s1==s2: ");
        if (s1==s2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
