package interview.designpattern.decorator;

public abstract class Component {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public abstract void operation();
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ConcreteComponent person = new ConcreteComponent("SuperMan");
        Decoration decorationA = new DecorationA("armor");
        Decoration decorationB = new DecorationB("sword");
        
        decorationA.decorate(person);
        decorationB.decorate(decorationA);
        decorationB.operation();
    }

}
