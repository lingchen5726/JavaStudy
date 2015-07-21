package command;

public class Beer extends Command {

    public Beer(Chief chief) {
        super(chief);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void executeCommand() {
        // TODO Auto-generated method stub
        chief.beer();
    }

}
