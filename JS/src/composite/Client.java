package composite;

public class Client {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    
    public static void tree() {
        Composite root = new Composite("Headquarter");
        root.add(new LeafResource("RenLi Zongbu"));
        root.add(new LeafFinance("Caiwu Zongbu"));
        
        Composite branchSh = new Composite("ShangHai subsidiary");
        branchSh.add(new LeafResource("RenLi Shanghai fenbu"));
        branchSh.add(new LeafFinance("Caiwu Shanghai fenbu"));

        Composite branchShPd = new Composite("ShangHai subsidiary Pudong banshichu");
        branchShPd.add(new LeafResource("RenLi Shanghai PuDong Banshichu"));
        //branchShPd.add(new LeafFinance("Caiwu Shanghai fenbu"));
        
        branchSh.add(branchShPd);
        
        root.add(branchSh);
        root.show(1);
        root.lineOfDuty();
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        tree();
        
    }

}
