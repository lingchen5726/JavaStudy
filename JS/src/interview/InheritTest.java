package interview;

public class InheritTest extends InheritTestFather{

    InheritTestFather father;
    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public InheritTest() {
        System.out.println(4);
    }
    
    public InheritTest(String name) {
        //super(name);  Result will be 2,3
        System.out.println(3);
        father = new InheritTestFather(name+":F");
    }
    
    @Override
    public void haha(int n) {
        System.out.println("Overrided");
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InheritTest t = new InheritTest("Mike");
    }

}

class InheritTestFather {
    String name;

    public InheritTestFather() {
        System.out.println(1);
    }
    
    
    public InheritTestFather(String name) {
        this.name = name;
        System.out.println(2);
    }
    
    public void haha(int n) {
        System.out.println();
    }
}