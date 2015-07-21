package interview.designpattern.chain;

public class ZongJingLi extends Manager {

    public ZongJingLi(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void handleRequest(Request r) {
        // TODO Auto-generated method stub
        if ((r.getType()=="LeaveApplication" && r.getNum()<=10) 
                || (r.getType()=="RaiseSalary" && r.getNum()<=1500)) {
            System.out.println(getName()+": approved "+r.getRequester()+"'s "+r.getType()+":"+r.getNum());
        } else {
            getSuccessor().handleRequest(r);
        }
    }

}
