package observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    public void Notify() {
        Iterator<Observer> iter = observers.iterator();
        while (iter.hasNext()) {
            iter.next().Update();
        }
    }
}
