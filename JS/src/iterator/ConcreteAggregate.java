package iterator;

import java.util.ArrayList;

public class ConcreteAggregate extends Aggregate {

    ArrayList<Object> items = new ArrayList<Object>();
    
    public ConcreteAggregate() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return new ConcreteIterator(this);
    }

    public Object getObject(int index){
        return items.get(index);
    }
    
    public int size() {
        return items.size();
    }
    
    public void add(Object o) {
        items.add(o);
    }
}
