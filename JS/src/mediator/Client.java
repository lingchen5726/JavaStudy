package mediator;

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
        ConcreteMediator m = new ConcreteMediator("LianHeGuo AnLiHui");
        Country usa = new USA(m);
        Country iraq = new Iraq(m);
        m.setUsa(usa);
        m.setIraq(iraq);
        
        usa.send("Ni you he wu qi, wo yao da ni");
        iraq.send("Wo mei you, yao da zhi guan da");
        
    }

}
