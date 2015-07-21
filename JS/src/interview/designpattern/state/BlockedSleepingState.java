package interview.designpattern.state;

public class BlockedSleepingState extends State {

    @Override
    public void handle(Protocol protocol, String event) {
        // TODO Auto-generated method stub
        if (event=="sleepTimeout") {
            System.out.println("SleepTimeout, change state to Runnable");
            protocol.s = new RunnableState();
        }
    }

}
