package java24hours;

public class RefactorSync {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private static int nextId = 0;
    
    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        RefactorSync.nextId = nextId;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RefactorSync r = new RefactorSync();
        int id = r.getNextId();
        id++;
        r.setNextId(id);
        
    }

}
