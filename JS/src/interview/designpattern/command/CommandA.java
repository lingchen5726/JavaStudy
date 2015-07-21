package interview.designpattern.command;

public class CommandA extends Command {

    public CommandA(Executor executor) {
        super(executor);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        executor.zhixing();
    }

}
