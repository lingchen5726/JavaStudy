package test;

public class Mdebug {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static int numOfInstances = 0;
    
    public Mdebug() {
        if (numOfInstances<3) {
            numOfInstances++;
            System.out.println("\tMdebug created");
        } else {
            System.out.println("\t\tMeet the maxium limit "+numOfInstances);
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i=1;i<=10;i++) {
            System.out.println("To create the "+i+" Mdebug...");
            Mdebug md = new Mdebug();
        }
    }

}
