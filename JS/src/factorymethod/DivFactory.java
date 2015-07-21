package factorymethod;

public class DivFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new OperationDiv();
	}

}
