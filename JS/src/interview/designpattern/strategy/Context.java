package interview.designpattern.strategy;

public class Context {

    Strategy strategy;
    
    public Context(String strategyType, Object[] args) {
        if ("Rebate".equalsIgnoreCase(strategyType)) {
            strategy = new RebateStrategy(((Double)args[0]).doubleValue());
        } else if ("CashReturn".equalsIgnoreCase(strategyType)) {
            strategy = new CashReturnStrategy(((Double)args[0]).doubleValue(), ((Double)args[1]).doubleValue());
        } else {
            
        }
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
        Context c1 = new Context("Rebate", new Object[]{0.9});
        Context c2 = new Context("CashReturn", new Object[]{150.0,20.0});
        c1.calc(1000,1);
        c2.calc(1000,1);
        
    }

    public void calc(int price, int num) {
        // TODO Auto-generated method stub
        System.out.println(strategy.algo(price, num));
    }

}
