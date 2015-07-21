package flyweight;

public abstract class FlyWeight {
    String name;
    public FlyWeight(String name) {
        this.name = name;
    }
    public abstract void use(User u);
}
