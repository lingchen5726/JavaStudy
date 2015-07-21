package flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
    HashMap<String, FlyWeight> flyweights = new HashMap<String, FlyWeight>();

    public FlyWeight getFlyWeight(String key) {
        // TODO Auto-generated method stub
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyWeight(key));
        }
        
        return flyweights.get(key);
    }

    public void getCount() {
        // TODO Auto-generated method stub
        System.out.println("The number of flyweights is "+flyweights.size());
    }
    
}
