package chain;

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
        Handler m = new Manager("Jing Li");
        Handler d = new Director("Zong Jian");
        Handler g = new GeneralManager("Zong Jing Li");
        m.setSuccessor(d);
        d.setSuccessor(g);

        Request rl = new Request("Da niao", "qingjia", 2);
        Request rs = new Request("Xiao cai", "jiaxin", 5000);
        m.Handle(rl);
        m.Handle(rs);
    }

}
