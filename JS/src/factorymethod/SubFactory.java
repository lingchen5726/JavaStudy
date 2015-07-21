package factorymethod;

public class SubFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new OperationSub();
	}

}
