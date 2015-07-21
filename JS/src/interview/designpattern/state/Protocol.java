package interview.designpattern.state;

public class Protocol {
    State s = null;
    
    public Protocol() {
        s = new NewState();
    }

    public void handle(String event) {
        s.handle(this, event);
    }
    
    
}
