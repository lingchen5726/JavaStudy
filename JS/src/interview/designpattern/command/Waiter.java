package interview.designpattern.command;

import java.util.ArrayList;
import java.util.Date;

public class Waiter {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private ArrayList<Command> cmds = new ArrayList<Command>();
    
    public void addCmd(Command cmd) {
        // TODO Auto-generated method stub
        Date date = new Date();
        System.out.println(cmd.toString()+" was ordered at "+date.toString());
        cmds.add(cmd);
    }
    
    public void removeCmd(Command cmd) {
        // TODO Auto-generated method stub
        Date date = new Date();
        System.out.println(cmd.toString()+" was canceled at "+date.toString());
        cmds.remove(cmd);
    }
    
    public void notifyExecutors() {
        // TODO Auto-generated method stub
        for (Command cmd: cmds) {
            cmd.execute();
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Executor exeA = new ExeA();
        Executor exeB = new ExeB();
        Command cmdA = new CommandA(exeA);
        Command cmdB = new CommandB(exeB);
        Waiter w = new Waiter();
        
        w.addCmd(cmdA);
        w.addCmd(cmdB);
        w.addCmd(cmdB);
        w.addCmd(cmdA);
        w.notifyExecutors();
        
    }





}
