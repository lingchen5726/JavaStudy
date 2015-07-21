package interview.designpattern.visitor;

public class ZongJie {
    Person[] nv;
    Visitor[] v;
    
    public ZongJie() {
        nv = new Person[]{new Man(), new Woman()};
        v = new Visitor[]{new Success(), new Fail()};
    }

    public void show() {
        for (Visitor sv: v) {
            for (Person p: nv) {
                p.accept(sv);
            }
        }
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
        new ZongJie().show();
    }

}
