package composite;

import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> children = new ArrayList<Component>();
    
    public Composite(String name) {
        // TODO Auto-generated constructor stub
        super(name);
    }

    @Override
    public void add(Component c) {
        // TODO Auto-generated method stub
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        // TODO Auto-generated method stub
        children.remove(c);
    }

    @Override
    public void show(int depth) {
        // TODO Auto-generated method stub
        System.out.println(showDepth(depth)+name);
        for (Component c:children) {
            c.show(depth+2);
        }
    }

    @Override
    public void lineOfDuty() {
        // TODO Auto-generated method stub
        for (Component c:children) {
            c.lineOfDuty();
        }
    }

}
