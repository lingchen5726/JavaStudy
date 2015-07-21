package interview.algorithm;

public class RecursiveIteration {

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
        int n=5;
        System.out.println("rf("+n+")="+recursiveFibonacci(n));
        System.out.println("if("+n+")="+iterationFibonacci(n));
        System.out.println("df("+n+")="+dynamicFibonacci(n));
    }

    public static int[] A = new int[100];
    
    private static int dynamicFibonacci(int n) {
        // TODO Auto-generated method stub
        if (n<2) {
            A[n] = 1;
        }
        if (A[n]>0) {
            return A[n];
        } else {
            A[n] = dynamicFibonacci(n-1)+dynamicFibonacci(n-2);
        }
        return A[n];
    }

    private static int iterationFibonacci(int i) {
        // TODO Auto-generated method stub
        if (i<2) {
            return 1;
        } else {
            int third = 0;
            int second = 1;
            int first = 1;
            System.out.println("Round\tfirst\tsecond\tthird");
            for (int j=2;j<=i;j++) {
                third = first + second;
                first = second;
                second = third;
                System.out.println(j+"\t"+first+"\t"+second+"\t"+third);
            }
            return third;
        }
    }

    private static int recursiveFibonacci(int i) {
        // TODO Auto-generated method stub
        if (i<2) {
            return 1;
        } else {
            System.out.println("f("+i+")=f("+(i-1)+")+"+"f("+(i-2)+")");
            return recursiveFibonacci(i-1)+recursiveFibonacci(i-2);
        }
    }

    
    
}
