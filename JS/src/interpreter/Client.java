package interpreter;

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
        PlayContext context = new PlayContext("O2E1G1A3E1G1D2E1G1A1O3C1O2A0G1C0E0D3");
        Expression exp = null;
        while(context.getLength()>0) {
            String str = context.getPlayText().substring(0,1);
            if ("O".equalsIgnoreCase(str)) {
                exp = new Scale();
            } else if (("C".equalsIgnoreCase(str))||("D".equalsIgnoreCase(str))||("E".equalsIgnoreCase(str))||("F".equalsIgnoreCase(str))||("G".equalsIgnoreCase(str))||("A".equalsIgnoreCase(str))||("B".equalsIgnoreCase(str))) {
                exp = new Note();
            }
            exp.interpret(context);
        }
    }

}
