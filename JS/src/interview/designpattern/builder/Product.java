package interview.designpattern.builder;

import java.util.ArrayList;

public class Product {
    private ArrayList<String> components = new ArrayList<String>();
    
    public void addParts(String partName) {
        components.add(partName);
    }
    
    public void show() {
        for (String comp:components) {
            System.out.println(comp);
        }
    }
}
