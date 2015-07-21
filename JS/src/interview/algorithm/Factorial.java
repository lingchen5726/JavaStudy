package interview.algorithm;

public class Factorial {

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
        System.out.println(factorial(4));
    }

    public static int factorial(int n) {
        int result = 0;
        
        if (n<=1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}
