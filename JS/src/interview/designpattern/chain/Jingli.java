package interview.designpattern.chain;

public class Jingli extends Manager {

    public Jingli(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void handleRequest(Request r) {
        // TODO Auto-generated method stub
        if ((r.getType()=="LeaveApplication" && r.getNum()<=2) 
                || (r.getType()=="RaiseSalary" && r.getNum()<=500)) {
            System.out.println(getName()+": approved "+r.getRequester()+"'s "+r.getType()+":"+r.getNum());
        } else {
            getSuccessor().handleRequest(r);
        }
    }

}
