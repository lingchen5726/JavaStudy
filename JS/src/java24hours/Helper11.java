package java24hours;

public class Helper11 {

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
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Helper11 h = new Helper11();
        Tyre t = new Tyre(32);
    }

}

//If no public, it's a helper class.
class Tyre {
    int tSize;
    
    Tyre(int size) {
        tSize = size;
    }
}