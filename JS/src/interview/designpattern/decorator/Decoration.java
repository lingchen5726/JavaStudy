package interview.designpattern.decorator;

public abstract class Decoration extends Component {

    private Component component;
    private String name;
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Component getComponent() {
        return component;
    }


    public void setComponent(Component component) {
        this.component = component;
    }

    public Decoration(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
    }

    public void decorate(Component component) {
        setComponent(component);
    }

    //Here is the key, if there is a component inside, component.operation(If it's a decoration, then recursive do it) 
    //until it's just a concreteComponent, invoke comp.operation()
    @Override
    public void operation() {
        // TODO Auto-generated method stub
        if (null!=component) {
            component.operation();
        }
    }
}
