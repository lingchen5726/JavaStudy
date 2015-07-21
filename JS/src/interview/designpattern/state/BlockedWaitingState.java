package interview.designpattern.state;

public class BlockedWaitingState extends State {

    @Override
    public void handle(Protocol protocol, String event) {
        // TODO Auto-generated method stub
        if (event=="gotNotify") {
            System.out.println("Got notify, change state to blocked(Sync Lock)");
            protocol.s = new BlockedSyncLockState();
        }
    }

}
