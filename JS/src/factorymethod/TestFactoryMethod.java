package factorymethod;

public class TestFactoryMethod {

	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.CreateOperation();
		oper.NumberA = 1;
		oper.NumberB = 2;
		double result = oper.getResult();
		System.out.println("Result is "+result);
	}
}
