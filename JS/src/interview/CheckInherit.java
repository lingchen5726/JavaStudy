package interview;

public class CheckInherit extends Father {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private String childName;
    
    public CheckInherit(String father, String child) {
        super(father);
        this.childName = child;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CheckInherit c = new CheckInherit("Father", "Child");
    }

}

class Father {
    String name;
    
    public Father(String name) {
        this.name = name;
    }
}
