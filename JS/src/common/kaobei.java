package common;

public class kaobei {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    String a = "";
    int b = 0;
    
    kaobei() {
        a="A";
        b=1;
    }
    
    public void change(kaobei k) {
        k.b = 2;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        kaobei k = new kaobei();
        System.out.println("k.b is "+k.b);
        k.change(k);
        System.out.println("k.b is "+k.b);
    }

}
