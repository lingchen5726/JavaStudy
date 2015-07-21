package interview.designpattern.mediator;

public class ConcreteMediator extends Mediator {

    private Member us;
    private Member iraq;
    
    public ConcreteMediator(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void claim(String msg, Member member) {
        // TODO Auto-generated method stub
        if (member==us) {
            iraq.getMsg(msg);
        } else if (member==iraq) {
            us.getMsg(msg);
        } else {
            
        }
    }

    public void setUS(Member us) {
        // TODO Auto-generated method stub
        this.us = us;
    }

    public void setIraq(Member iraq) {
        // TODO Auto-generated method stub
        this.iraq = iraq;
    }

}
