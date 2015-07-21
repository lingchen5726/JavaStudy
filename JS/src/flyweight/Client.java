package flyweight;

public class Client {

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
        FlyWeightFactory f= new FlyWeightFactory();
        FlyWeight wsa = f.getFlyWeight("WebSite");
        wsa.use(new User("UserA"));
        FlyWeight wsb = f.getFlyWeight("WebSite");
        wsb.use(new User("UserB"));
        FlyWeight wba = f.getFlyWeight("Weibo");
        wba.use(new User("UserC"));
        FlyWeight wbb = f.getFlyWeight("Weibo");
        wbb.use(new User("UserD"));
        f.getCount();
    }

}
