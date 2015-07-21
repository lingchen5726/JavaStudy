package interview.designpattern.state;

public abstract class State {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Protocol p = new Protocol();
        p.handle("start");
        p.handle("gotCPU");
        //For yield()
        p.handle("yield");
        p.handle("gotCPU");
        //For sleep()
        p.handle("sleep");
        p.handle("sleepTimeout");
        p.handle("gotCPU");
        //For IO operation
        p.handle("IO");
        p.handle("IOdone");
        p.handle("gotCPU");
        //For requiring sync lock
        p.handle("syncLockRequired");
        p.handle("syncLockGot");
        p.handle("gotCPU");
        //For wait()
        p.handle("wait");
        p.handle("gotNotify");
        p.handle("syncLockGot");
        p.handle("gotCPU");
        //For exit normally
        //p.handle("runOk");
        //For exception or System.exit()
        //p.handle("exception");
        p.handle("exit");
        p.handle("shutdown");
    }

    public abstract void handle(Protocol protocol, String event);

}
