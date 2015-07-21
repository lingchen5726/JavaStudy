package interview.designpattern.observer;

public class ConcreteObserverStock extends MyObserver {

    public ConcreteObserverStock(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    public void gengxin(String event) {
        // TODO Auto-generated method stub
        System.out.println(event+", start purchasing stock...");
    }

}
