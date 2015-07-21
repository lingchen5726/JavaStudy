package chain;

public class Director extends Handler {

    public Director(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void Handle(Request r) {
        // TODO Auto-generated method stub
        String rName = r.getRequester();
        String rType = r.getType();
        int rVolumn = r.getVolumn();
        
        if (rType.equalsIgnoreCase("qingjia")) {
            if (rVolumn<5) {
                System.out.println(getName()+" appoved "+rName+"'s "+rType+"("+rVolumn+")");
            } else {
                nextHandle(r);
            }
        } else if (rType.equalsIgnoreCase("jiaxin")) {
            if (rVolumn<500) {
                System.out.println(getName()+" appoved "+rName+"'s "+rType+"("+rVolumn+")");
            } else {
                nextHandle(r);
            }
        } else {
            System.out.println("Unknow request type "+rType);
        }
    }

}
