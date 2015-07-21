package interview;

public class ConstructorTest extends Parent{

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public ConstructorTest() {
        //It will be implicitly invoked: super();
        System.out.println("ConstructorTest constructor:");
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ConstructorTest ct = new ConstructorTest();
        ConstructorTest ct2 = new ConstructorTest();
        System.out.println(ct.equals(ct2));
        String s1 = new String("a");
        String s2 = new String("a");
        System.out.println("s1.equals s2 is:"+s1.equals(s2));
        if (s1==s2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}

class Parent {
    public Parent() {
        System.out.println("Parent constructor:");
    }
}
