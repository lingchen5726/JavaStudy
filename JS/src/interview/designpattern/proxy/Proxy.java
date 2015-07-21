package interview.designpattern.proxy;

public class Proxy extends Subject{
    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private Subject realSubject;
    
    public Proxy(String name) {
        // TODO Auto-generated constructor stub
        super(name);
    }

    public void setRealSubject(Subject realSubject) {
        this.realSubject = realSubject;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Subject rs = new RealSubject("Original");
        Proxy p = new Proxy("Daili");
        p.setRealSubject(rs);
        p.request("Girl");
    }

    @Override
    public void request(String target) {
        // TODO Auto-generated method stub
        if (null!=realSubject) {
            System.out.println(name+": ");
            System.out.print("\t");
            realSubject.request(target);
        } else {
            System.out.println("Here is a gift from "+name+" to "+target);
        }
    }

}
