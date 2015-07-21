package interview.designpattern.strategy;

public class CashReturnStrategy implements Strategy {

    private double condition;
    private double cashReturn;
    
    public CashReturnStrategy(double condition, double cashReturn) {
        // TODO Auto-generated constructor stub
        this.condition = condition;
        this.cashReturn = cashReturn;
    }

    @Override
    public double algo(int price, int num) {
        // TODO Auto-generated method stub
        double totalprice = price*num;
        if (totalprice>condition) {
            totalprice -= cashReturn*Math.floor(totalprice/condition);
        }
        return totalprice;
    }

}
