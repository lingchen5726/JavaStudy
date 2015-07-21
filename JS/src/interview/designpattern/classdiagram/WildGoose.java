package interview.designpattern.classdiagram;

public class WildGoose extends Bird implements IFly{

    String name;
    
    public WildGoose(String name) {
        // TODO Auto-generated constructor stub
        super();
        this.name = name;
    }

    @Override
    public Egg lay() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void metabolism(Oxygen o2, Water water) {
        // TODO Auto-generated method stub

    }

    @Override
    public void breed() {
        // TODO Auto-generated method stub

    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("WildGoose "+name+" is flying");
    }

}
