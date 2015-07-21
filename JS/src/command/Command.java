package command;

public abstract class Command {
    protected Chief chief;
    public Command(Chief chief) {
        this.chief = chief;
    }
    abstract public void executeCommand();
}
