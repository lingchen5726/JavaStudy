package singleton;

public enum EnumSingleton {
	INSTANCE("haha");
	private final String name;	
	private EnumSingleton(String str) {
		System.out.println("Initialization of EnumSingleton");
		name = str;
	}
	public void printName() {
		System.out.println("EnumSingleton.name is "+this.name);
	}
	public static void main(String[] args) {
		for (EnumSingleton es : EnumSingleton.values()) {
			es.printName();
		}
		EnumSingleton es2 = EnumSingleton.INSTANCE;
		es2.printName();
	}
}
