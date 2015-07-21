package interview.designpattern.observer;

import java.util.ArrayList;

import observer.Observer;

public class Subject {

    private ArrayList<MyObserver> obs = new ArrayList<MyObserver>();
    private String name = "";
    public String myEvent;
    
    public void attach(MyObserver ob) {
        obs.add(ob);
    }

    public void dettach(MyObserver ob) {
        obs.remove(ob);
    }

    public Subject(String name) {
        this.name = name;
    }
    
    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Subject cs = new ConcreteSubject("cs");
        MyObserver o1 = new ConcreteObserverStock("Stock observer");
        MyObserver o2 = new ConcreteObserverRealEstate("Real estate observer");
        cs.attach(o1);
        cs.attach(o2);
        cs.myEvent = "Yanghang jiangxi";
        cs.tongzhi(cs.myEvent);
    }

    public void tongzhi(String event) {
        // TODO Auto-generated method stub
        for (MyObserver ob: obs) {
            ob.gengxin(event);
        }
    }

}
