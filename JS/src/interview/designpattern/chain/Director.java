package interview.designpattern.chain;

public class Director extends Manager {

    public Director(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void handleRequest(Request r) {
        // TODO Auto-generated method stub
        if ((r.getType()=="LeaveApplication" && r.getNum()<=5) 
                || (r.getType()=="RaiseSalary" && r.getNum()<=1000)) {
            System.out.println(getName()+": approved "+r.getRequester()+"'s "+r.getType()+":"+r.getNum());
        } else {
            getSuccessor().handleRequest(r);
        }
    }

}
