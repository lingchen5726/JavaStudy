package interview.designpattern.strategy;

public class RebateStrategy implements Strategy {

    private double discount;
    
    public RebateStrategy(double discount) {
        // TODO Auto-generated constructor stub
        this.discount = discount;
    }

    @Override
    public double algo(int price, int num) {
        // TODO Auto-generated method stub
        return price*num*discount;
    }

}
