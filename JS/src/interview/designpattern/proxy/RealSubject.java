package interview.designpattern.proxy;

public class RealSubject extends Subject {

    public RealSubject(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void request(String target) {
        // TODO Auto-generated method stub
        System.out.println("This is a gift from "+name+" to "+target);
    }


}
