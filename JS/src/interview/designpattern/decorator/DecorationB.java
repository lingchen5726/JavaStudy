package interview.designpattern.decorator;

public class DecorationB extends Decoration {

    public DecorationB(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    public void operation() {
        super.operation();
        System.out.println("wielding "+getName());
    }
}
