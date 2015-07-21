package interview;

public abstract class PermGenSpaceTest {

    private static int numOfPermGenInstances = 0;
    
    PermGenSpaceTest(){
        numOfPermGenInstances++;
        System.out.println("The "+numOfPermGenInstances+" instance of PermGenSpaceTest");
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
    public abstract void todo(int i);
    
    public static void main(String[] args) {
        for (int i=0;i<1000000;i++) {
        // TODO Auto-generated method stub
            PermGenSpaceTest pt = new PermGenSpaceTest(){
                
                @Override
                public void todo(int i) {
                    // TODO Auto-generated method stub
                    System.out.println(i);
                }
                
            };
            pt.todo(i);
        }
    }

    protected void finalize() throws Exception{
        System.out.println("Release PermGenSpaceTest "+numOfPermGenInstances);
    }
    
}
