package flyweight;

public class ConcreteFlyWeight extends FlyWeight {

    public ConcreteFlyWeight(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void use(User u)  {
        System.out.println("Category: "+name+", user("+u.getName()+")");
    }

}
