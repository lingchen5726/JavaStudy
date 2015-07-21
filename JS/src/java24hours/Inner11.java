package java24hours;

public class Inner11 {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    String name = "Car";
    
    public void getTyre() {
        Tyre tyre = new Tyre(32);
    }

    //It seems that the public is useless here.
    class Tyre {
        int tSize;
        
        Tyre(int size) {
            tSize = size;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Inner11 inner11 = new Inner11();
        Tyre t = inner11.new Tyre(32);
    }

}
