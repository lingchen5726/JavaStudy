package testOutsidePackage;

import java24hours.Protect11;

public class SubProtect11 extends Protect11 {

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
        //If Protect11 p = new SubProtect11(), still can't access the protected attribute.
        SubProtect11 p = new SubProtect11();
        p.showAllSeconds();

        p.pubSeconds = 61;
        p.proSeconds = 51;
        //p.priSeconds = 41;
        p.showAllSeconds();
    }

}
