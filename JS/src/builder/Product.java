package builder;

import java.util.ArrayList;
import java.util.Iterator;

public class Product {
    ArrayList<String> parts = new ArrayList<String>();
    
    public void addPart(String part) {
        parts.add(part);
    }
    
    public void show() {
        Iterator<String> iter = parts.iterator();
        while (iter.hasNext()) {
            System.out.println("Product's part is: "+iter.next());
        }
    }
    
    public static void main(String[] args) {
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();
        
        Director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();
        
        Director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
