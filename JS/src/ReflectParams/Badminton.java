package ReflectParams;

public class Badminton implements ISport{

	int _times;
	public Badminton(int times) {
		_times = times;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		for (int i=0;i<_times;i++) {
			System.out.println("Play badminton");
		}
	}

}
