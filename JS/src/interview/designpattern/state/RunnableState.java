package interview.designpattern.state;

public class RunnableState extends State {

    @Override
    public void handle(Protocol protocol, String event) {
        // TODO Auto-generated method stub
        if (event=="gotCPU") {
            System.out.println("Got CPU, change state to Running");
            protocol.s = new RunningState();
        }
    }

}
