package command;

import java.util.Date;
import java.util.ArrayList;

public class Waiter {
    String name;
    public Waiter(String name) {
        this.name = name;
    }
    ArrayList<Command> cmds = new ArrayList<Command>();
    
    public void addOrder(Command command) {
        if(command.toString().startsWith("command.Beer")) {
            System.out.println(name+": No beer now.");
        } else {
            cmds.add(command);
            Date d = new Date();
            System.out.println(d.toString()+": Added order "+command.toString());
        }
    }
    public void cancelOrder(Command command) {
        cmds.remove(command);
        Date d = new Date();
        System.out.println(d.toString()+": Removed order "+command.toString());
    }
    public void xiaDan() {
        // TODO Auto-generated method stub
        for (Command c:cmds) {
            c.executeCommand();
        }
    }
}
 