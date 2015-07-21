package java24hours;

import java24hours.Protect11;

public class Test11protectedInPackage {

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
        Protect11 p = new Protect11();
        p.showAllSeconds();

        p.pubSeconds = 61;
        // It shows that the default int priSeconds is not private, not protected, but package access control.
        //p.priSeconds = 41;
        p.proSeconds = 51;
        p.showAllSeconds();
    }

}
