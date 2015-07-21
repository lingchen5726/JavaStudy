package interview.designpattern.builder;

public class BuildDirector {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BuildDirector bd = new BuildDirector();
        Builder b1 = new BuilderA();
        Product p1 = bd.construct(b1);
        p1.show();

        Builder b2 = new BuilderB();
        Product p2 = bd.construct(b2);
        p2.show();
    
    }

    public Product construct(Builder builder) {
        // TODO Auto-generated method stub
        builder.buildBread();
        builder.buildChicken();
        return builder.getProduct();
    }

}
