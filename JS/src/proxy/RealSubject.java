package proxy;

public class RealSubject implements Subject {

	String name;
	@Override
	public void request(String obj) {
		// TODO Auto-generated method stub
		System.out.println("Dear "+obj+": I'm "+name+", shall we go dinner?");
	}
	
	RealSubject (String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		String obj = "JiaoJiao";
		RealSubject r = new RealSubject("ZhuoJiaYi");
		r.request(obj);
	}
}
