package factorymethod;

public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		double result = 0;
		
		if (0!=NumberB) {
			result = NumberA/NumberB;
		} else {
			try {
				throw new Exception("NumberB can't be zero.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
