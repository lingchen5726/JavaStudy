package facade;

public class Facade {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    Stock stock;
    Realty realty;
    
    Facade() {
        stock = new Stock();
        realty = new Realty();
    }
    
    public void buyFund() {
        stock.buy();
        realty.buy();
    }
    
    public void sellFund() {
        stock.sell();
        realty.sell();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Facade fund = new Facade();
        fund.buyFund();
        fund.sellFund();
    }

}
