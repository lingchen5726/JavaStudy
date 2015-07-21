package java24hours;

public class Virus11 {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    //class variables will only be initialized once the class are first created or referred.
    static int virusNum = 0;
    //The initialization will be 
    //the class's superclass and its variables, 
    //this class's class variable(if first time)
    //this class's object variables (every time)
    //this class's construction method (every time)
    
    public Virus11() {
        Virus11.virusNum++;
    }
    
    static int getVirusNum() {
        return Virus11.virusNum;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num = 0;
        if (args.length>0) {
            num = Integer.parseInt(args[0]);
        }
        if (num>0) {
            Virus11[] virii = new Virus11[num];
            for (int i=0;i<num;i++) {
                virii[i] = new Virus11();
            }
            System.out.println(Virus11.getVirusNum()+" viruses are created.");
            System.out.println("The size of Virus11[] is "+virii.length);
        }
    }

}
