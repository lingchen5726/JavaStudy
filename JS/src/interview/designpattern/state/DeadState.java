package interview.designpattern.state;

public class DeadState extends State {

    @Override
    public void handle(Protocol protocol, String event) {
        // TODO Auto-generated method stub
        System.out.println("Dead thread, no response any more...");
    }

}
