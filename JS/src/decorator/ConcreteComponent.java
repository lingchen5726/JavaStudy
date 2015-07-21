package decorator;

public class ConcreteComponent extends Component {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteComponent");
	}

	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA da = new ConcreteDecoratorA();
		ConcreteDecoratorB db = new ConcreteDecoratorB();
		da.setComponent(c);
		db.setComponent(da);
		System.out.println("db:");
		db.operation();
		System.out.println("da:");
		da.operation();
	}
}
