package ReflectParams;

public class Football implements ISport{

	int _times;
	public Football(int times) {
		_times = times;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		for (int i=0;i<_times;i++) {
			System.out.println("Play football");
		}
	}

}
