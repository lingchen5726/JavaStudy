package interview.designpattern.state;

public class BlockedIOState extends State {

    @Override
    public void handle(Protocol protocol, String event) {
        // TODO Auto-generated method stub
        if (event=="IOdone") {
            System.out.println("IO done, change state to Runnable");
            protocol.s = new RunnableState();
        }
    }

}
