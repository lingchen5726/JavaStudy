package proxy;

public class Proxy implements Subject {

	RealSubject realSubject;
	String proxyName;
	@Override
	public void request(String obj) {
		// TODO Auto-generated method stub
		System.out.println("I'm "+proxyName+", here are some messages for you:");
		realSubject.request(obj);
	}
	
	public Proxy (String subjectName, String proxyName) {
		this.realSubject = new RealSubject(subjectName);
		this.proxyName = proxyName;
	}

	public static void main(String[] args) {
		String obj = "JiaoJiao";
		Proxy p = new Proxy("ZhuoJiaYi", "DaiLi");
		p.request(obj);
	}
}
