package interview;

class HelloA {
    public HelloA() {
        System.out.println("HelloA");
    }
    {
        System.out.println("I'm A class");
    }
    static {System.out.println("static A");}
}

public class StaticConstructor extends HelloA {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public StaticConstructor() {
        System.out.println("HelloB");
    }
    {
        System.out.println("I'm B class");
    }
    static {System.out.println("static B");}
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("--------Main Starts--------");
        new StaticConstructor();
        new StaticConstructor();
        System.out.println("--------Main Ends--------");
    }

}
