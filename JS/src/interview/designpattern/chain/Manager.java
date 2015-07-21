package interview.designpattern.chain;

public abstract class Manager {
    private String name;
    private Manager successor;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getSuccessor() {
        return successor;
    }

    public void setSuccessor(Manager successor) {
        this.successor = successor;
    }

    public Manager(String name) {
        this.name = name;
    }
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
        Manager m = new Jingli("JingLi");
        Manager d = new Director("ZongJian");
        Manager gm = new ZongJingLi("ZongJingLi");
        m.setSuccessor(d);
        d.setSuccessor(gm);
        
        Request rl = new Request("XiaoZhang", "LeaveApplication", 5);
        Request rr = new Request("XiaoZhang", "RaiseSalary", 1200);
        m.handleRequest(rl);
        m.handleRequest(rr);
    }

    public abstract void handleRequest(Request r);
}
