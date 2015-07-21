package interview.designpattern.flyweight;

public class ConcreteFlyWeight extends FlyWeight {

    private String color;
    
    public ConcreteFlyWeight(String key) {
        // TODO Auto-generated constructor stub
        this.color = key;
    }

    @Override
    public void show(ExternalState exs) {
        // TODO Auto-generated method stub
        System.out.println("Printing "+color+" chess at "+exs.x+","+exs.y);
    }

}
