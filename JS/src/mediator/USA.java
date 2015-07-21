package mediator;

public class USA extends Country {

    public USA(Mediator m) {
        super(m);
        // TODO Auto-generated constructor stub
    }

    public void notify(String msg) {
        System.out.println("USA got: "+msg);
    }
}
