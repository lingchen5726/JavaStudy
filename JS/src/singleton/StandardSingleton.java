package singleton;

public class StandardSingleton {
	private static final StandardSingleton INSTANCE = new StandardSingleton();
	
	private StandardSingleton() {
		System.out.println("First time to create singleton.");
	}
	
	public static StandardSingleton getInstance() {
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		StandardSingleton first = StandardSingleton.getInstance();
		StandardSingleton second = StandardSingleton.getInstance();
	}
}

