package interview.designpattern.state;

public class NewState extends State {

    @Override
    public void handle(Protocol protocol, String event) {
        // TODO Auto-generated method stub
        if (event=="start") {
            System.out.println("Thread started, change state to Runnable");
            protocol.s = new RunnableState();
        }
    }

}
