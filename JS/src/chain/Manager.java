package chain;

public class Manager extends Handler {

    public Manager(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void Handle(Request r) {
        String rName = r.getRequester();
        String rType = r.getType();
        int rVolumn = r.getVolumn();
        
        if (rType.equalsIgnoreCase("qingjia")) {
            if (rVolumn<3) {
                System.out.println(getName()+" appoved "+rName+"'s "+rType+"("+rVolumn+")");
            } else {
                nextHandle(r);
            }
        } else if (rType.equalsIgnoreCase("jiaxin")) {
            if (rVolumn<200) {
                System.out.println(getName()+" appoved "+rName+"'s "+rType+"("+rVolumn+")");
            } else {
                nextHandle(r);
            }
        } else {
            System.out.println("Unknow request type "+rType);
        }
    }
    
}
