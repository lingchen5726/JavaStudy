package interview.designpattern.state;

public class BlockedSyncLockState extends State {

    @Override
    public void handle(Protocol protocol, String event) {
        // TODO Auto-generated method stub
        if (event=="syncLockGot") {
            System.out.println("Got Sync lock, change state to Runnable");
            protocol.s = new RunnableState();
        }
    }

}
