package interview.designpattern.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
    private static HashMap<String, ConcreteFlyWeight> flyWeights= new HashMap<String, ConcreteFlyWeight>();

    public static FlyWeight getFlyWeight(String key) {
        // TODO Auto-generated method stub
        ConcreteFlyWeight flyweight= flyWeights.get(key);
        if (null==flyweight) {
            flyweight = new ConcreteFlyWeight(key);
            flyWeights.put(key, flyweight);
        }
        return flyweight;

    }
    
    public static int getInstancesNumber() {
        return flyWeights.size();
    }
}
