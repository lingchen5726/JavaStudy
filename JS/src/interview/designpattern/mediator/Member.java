package interview.designpattern.mediator;

public class Member {
    Mediator m;
    String name;
    
    public Member(Mediator mediator, String name) {
        this.m = mediator;
        this.name = name;
    }

    public void send(String msg) {
        // TODO Auto-generated method stub
        m.claim(msg, this);
    }
    
    public void getMsg(String msg) {
        System.out.println(name+" received: "+ msg);
    }
}
