package visitor;

import java.util.ArrayList;

public class ObjectStructure {
    ArrayList<Person> pl = new ArrayList<Person>();

    public void attach(Person p) {
        // TODO Auto-generated method stub
        pl.add(p);
    }
    
    public void detach(Person p) {
        // TODO Auto-generated method stub
        pl.remove(p);
    }
    
    public void display(Visitor v) {
        for(Person p:pl) {
            p.accept(v);
        }
    }
}
