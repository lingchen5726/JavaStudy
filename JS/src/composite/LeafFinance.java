package composite;

public class LeafFinance extends Component {

    public LeafFinance(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void add(Component c) {
        // TODO Auto-generated method stub
        System.out.println("This is a leaf, no add function");
    }

    @Override
    public void remove(Component c) {
        // TODO Auto-generated method stub
        System.out.println("This is a leaf, no remove function");
    }

    @Override
    public void show(int depth) {
        // TODO Auto-generated method stub
        System.out.println(showDepth(depth)+name);
    }

    @Override
    public void lineOfDuty() {
        // TODO Auto-generated method stub
        System.out.println(this.name+":Caiwu");
    }

}
