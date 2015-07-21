package interview.designpattern.command;

public abstract class Command {

    protected Executor executor;
    
    public Command(Executor executor) {
        this.executor = executor;
    }
    
    public abstract void execute();

}
