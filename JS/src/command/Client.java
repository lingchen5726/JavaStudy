package command;

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
        // TODO Combine with state mode to add state of command.
        Chief c = new Chief("Shi fu");
        Waiter w = new Waiter("Fu wu yuan");
        Command bakeYRC = new BakeYRC(c);
        Command beer = new Beer(c);
        w.addOrder(bakeYRC);
        w.addOrder(bakeYRC);
        w.addOrder(beer);
        w.cancelOrder(bakeYRC);
        w.xiaDan();
    }
}
