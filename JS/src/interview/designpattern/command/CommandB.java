package interview.designpattern.command;

public class CommandB extends Command {

    public CommandB(Executor executor) {
        super(executor);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        executor.zhixing();
    }

}
