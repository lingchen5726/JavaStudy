package java24hours;

public class Loop8 {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    static void namingLoop() {
        int target=100;
        int points=0;
        int loop=1;
        targetloop:
        while (target<=100) {
            System.out.println("Loop:"+loop);
            for (int i=0;i<target;i++) {
                if (points>50) {
                    break targetloop;
                } else {
                    points+=i;
                    System.out.println("\tPoints:"+points);
                }
            }
            loop++;
        }
    }
    
    static void testSpeed() {
        long startTime = System.currentTimeMillis();
        final int SECONDS=10;
        long stopTime = startTime+SECONDS*1000;
        long index = 0;
        while(true) {
            double s = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if (now>stopTime) {
                break;
            }
            index++;
        }
        System.out.println("Total "+index+" loops executed in "+SECONDS+" seconds");
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //namingLoop();
        testSpeed();
    }

}
