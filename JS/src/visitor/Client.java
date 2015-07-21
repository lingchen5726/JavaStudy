package visitor;

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
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());
        
        Visitor s = new Success();
        Visitor f = new Failure();
        Visitor l = new Love();
        
        o.display(s);
        o.display(f);
        o.display(l);
    }

}
