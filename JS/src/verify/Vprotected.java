package verify;

public class Vprotected extends VBase{

    public Vprotected(String a, String p) {
        super(a, p);
        // TODO Auto-generated constructor stub
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
        Vprotected vp = new Vprotected("a", "p");
        //Can't access vp.a
        System.out.println(vp.p);
    }

}
