package observer;

public class ConcreteObserver1 implements Observer {

    private ConcreteSubject sub;
    private String name;
    //private String observerState;
    
    public ConcreteObserver1(ConcreteSubject subject, String name) {
        this.sub = subject;
        this.name = name;
    }
    
    @Override
    public void Update() {
        // TODO Auto-generated method stub
        System.out.println("According to event:"+sub.getSubjectState()+", state of "+name+" changed.");
    }

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        ConcreteObserver1 o1 = new ConcreteObserver1(s, "A");
        ConcreteObserver1 o2 = new ConcreteObserver1(s, "B");
        
        s.attach(o1);
        s.attach(o2);
        s.setSubjectState("Wolf!");
        s.Notify();
    }
}
