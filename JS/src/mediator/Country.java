package mediator;

public abstract class Country {
    protected Mediator mediator;
    
    public Country(Mediator m) {
        this.mediator = m;
    }
    
    public void send(String msg) {
        mediator.send(msg, this);
    }
    
    public abstract void notify(String msg);
}
