package interview.designpattern.state;

public class RunningState extends State {

    @Override
    public void handle(Protocol protocol, String event) {
        // TODO Auto-generated method stub
        if (event=="yield") {
            System.out.println("Yield itself, change state to Runnable");
            protocol.s = new RunnableState();
        } else if (event=="sleep") {
            System.out.println("Sleeping, change state to blocked(sleeping)");
            protocol.s = new BlockedSleepingState();
        } else if (event=="IO") {
            System.out.println("IO operation, change state to blocked(IO)");
            protocol.s = new BlockedIOState();
        } else if (event=="wait") {
            System.out.println("Waiting, change state to blocked(Sync Lock)");
            protocol.s = new BlockedWaitingState();
        } else if (event=="syncLockRequired") {
            System.out.println("Try entering sync {}, change state to blocked(Sync Lock)");
            protocol.s = new BlockedSyncLockState();
        } else if (event=="runOk") {
            System.out.println("Run ok, change state to Dead");
            protocol.s = new DeadState();
        } else if (event=="exception" || event=="exit") {
            System.out.println("Exception occurred, change state to Dead");
            protocol.s = new DeadState();
        }
    }

}
