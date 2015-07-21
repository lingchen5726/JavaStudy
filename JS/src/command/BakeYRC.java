package command;

public class BakeYRC extends Command {

    public BakeYRC(Chief chief) {
        super(chief);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void executeCommand() {
        // TODO Auto-generated method stub
        chief.bakeYRC();
    }

}
