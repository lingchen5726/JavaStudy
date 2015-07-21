package interview.designpattern.flyweight;

public abstract class FlyWeight {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public abstract void show(ExternalState exs);
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FlyWeight fw1 = FlyWeightFactory.getFlyWeight("Black");
        fw1.show(new ExternalState(10,15));
        FlyWeight fw2 = FlyWeightFactory.getFlyWeight("Black");
        fw2.show(new ExternalState(10,16));
        FlyWeight fw3 = FlyWeightFactory.getFlyWeight("White");
        fw3.show(new ExternalState(11,15));
        FlyWeight fw4 = FlyWeightFactory.getFlyWeight("Black");
        fw4.show(new ExternalState(12,16));
        FlyWeight fw5 = FlyWeightFactory.getFlyWeight("Black");
        fw5.show(new ExternalState(11,17));
        FlyWeight fw6 = FlyWeightFactory.getFlyWeight("Black");
        fw6.show(new ExternalState(16,12));
        System.out.println("Instances number:"+FlyWeightFactory.getInstancesNumber());
    }

}
