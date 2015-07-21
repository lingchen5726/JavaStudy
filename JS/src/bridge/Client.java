package bridge;

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
    
    public static void testBridge() {
        Brand m = new BrandM("Brand M");
        m.add(new SoftA("Soft A"));
        m.add(new SoftB("Soft B"));
        m.show();
        
        Brand n = new BrandN("Brand N");
        n.add(new SoftA("Soft A"));
        n.add(new SoftC("Soft C"));
        n.show();
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        testBridge();
    }

}
