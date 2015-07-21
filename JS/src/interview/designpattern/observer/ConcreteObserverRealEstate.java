package interview.designpattern.observer;

public class ConcreteObserverRealEstate extends MyObserver {

    public ConcreteObserverRealEstate(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void gengxin(String event) {
        // TODO Auto-generated method stub
        System.out.println(event+", start purchasing apartments...");
    }

}
