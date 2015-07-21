package decorator;

public class ConcreteDecoratorB extends Decorator {
	public void operation() {
		super.operation();
		System.out.println("ConcreteDecoratorB");
		System.out.println("super.component.name is "+super.component.name);
	}
}
