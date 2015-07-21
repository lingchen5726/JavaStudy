package interview.designpattern.factory;

public abstract class AbstractOperator {

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
        double a=10, b=5;
        AbstractOperator cc = OperatorFactory.getConcreteCalculator("+");
        if (null!=cc) {
            System.out.println(cc.operate(a,b));
        }
    }

    public abstract double operate(double a, double b);

}
