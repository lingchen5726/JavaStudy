package mediator;

public class Iraq extends Country {

    public Iraq(Mediator m) {
        super(m);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void notify(String msg) {
        // TODO Auto-generated method stub
        System.out.println("Iraq got: "+msg);
    }

}
