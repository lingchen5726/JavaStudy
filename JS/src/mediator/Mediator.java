package mediator;

public abstract class Mediator {
    String name;
    
    public Mediator(String name) {
        this.name = name;
    }
    
    public abstract void send(String msg, Country c);
    
}
