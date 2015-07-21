package singleton;

public class LazySingleton {
	private static LazySingleton instance = null;
	
	private LazySingleton() {
		System.out.println("First initialization of LazySingleton");
	}
	
	public static synchronized LazySingleton getInstance() {
		if (null==instance) {
			instance = new LazySingleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		LazySingleton ls1 = LazySingleton.getInstance();
		LazySingleton ls2 = LazySingleton.getInstance();
		if (ls1==ls2) {
		    System.out.println("Same singleton");
		}
	}
}

