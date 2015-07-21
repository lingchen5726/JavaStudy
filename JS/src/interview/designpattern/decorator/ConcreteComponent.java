package interview.designpattern.decorator;

public class ConcreteComponent extends Component {
    String name;
    
    public ConcreteComponent(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
    }

    @Override
    public void operation() {
        // TODO Auto-generated method stub
        System.out.println("This is "+name);
    }

}
