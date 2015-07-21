package interview.designpattern.interpreter;

public class Context {

    private String context;
    
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Context(String context) {
        this.context = context;
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
        Context c = new Context("O2 G1 C1 D2 E3 D1 C1 D3 ");
        
        c.display();
    }

    private void display() {
        // TODO Auto-generated method stub
        Interpreter s = new Scale();
        Interpreter n = new Note();
        while (null!=context && !("".equals(context))) {
            if ("O".equals(context.substring(0,1))) {
                s.interpret(this);
            } else if ("O".equals(context.substring(0,1))
                    ||"C".equals(context.substring(0,1))
                    ||"D".equals(context.substring(0,1))
                    ||"E".equals(context.substring(0,1))
                    ||"F".equals(context.substring(0,1))
                    ||"G".equals(context.substring(0,1))
                    ||"A".equals(context.substring(0,1))
                    ||"B".equals(context.substring(0,1))
                    ) {
                n.interpret(this);
            } else {
                System.out.println("Error");
            }
        }
        
    }

}
