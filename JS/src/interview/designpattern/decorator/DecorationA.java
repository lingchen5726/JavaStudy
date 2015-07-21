package interview.designpattern.decorator;

public class DecorationA extends Decoration {

    public DecorationA(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    public void operation() {
        super.operation();
        System.out.println("wielding "+getName());
    }
}
