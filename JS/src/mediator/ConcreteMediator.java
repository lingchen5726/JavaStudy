package mediator;

public class ConcreteMediator extends Mediator {

    Country usa;
    Country iraq;
    
    public Country getUsa() {
        return usa;
    }

    public void setUsa(Country usa) {
        this.usa = usa;
    }

    public Country getIraq() {
        return iraq;
    }

    public void setIraq(Country iraq) {
        this.iraq = iraq;
    }

    public ConcreteMediator(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void send(String msg, Country c) {
        // TODO Auto-generated method stub
        if (c==usa) {
            iraq.notify(msg);
        } else if (c==iraq) {
            usa.notify(msg);
        }
    }

}
