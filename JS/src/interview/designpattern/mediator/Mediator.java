package interview.designpattern.mediator;

public abstract class Mediator {

    String name;
    public Mediator(String name) {
        this.name = name;
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
        ConcreteMediator m = new ConcreteMediator("LianHeGuo AnLiHui");
        Member us = new US(m, "U.S.");
        Member iraq = new IRAQ(m, "Iraq");
        m.setUS(us);
        m.setIraq(iraq);
        
        us.send("You has nuclear weapon, we'll attack.");
        iraq.send("We haven't, yet we'll fight back.");
    }

    public abstract void claim(String msg, Member member);

}
