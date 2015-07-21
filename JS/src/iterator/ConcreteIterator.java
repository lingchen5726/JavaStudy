package iterator;

public class ConcreteIterator extends Iterator {

    private ConcreteAggregate concreteAggregate;
    int current = 0;
    private Object currentObject = null;
    
    public ConcreteIterator(ConcreteAggregate agg) {
        // TODO Auto-generated constructor stub
        this.concreteAggregate = agg;
        current = 0;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        boolean result = concreteAggregate.size()>current;
        if (result) {
            currentObject = concreteAggregate.getObject(current);
            current ++;
        }
        
        return result;
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        return currentObject;
    }

    @Override
    public Object reset() {
        // TODO Auto-generated method stub
        return null;
    }

}
