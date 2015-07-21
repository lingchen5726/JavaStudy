package prototype;

public class ConcretePrototype1 implements Prototype {

	private String name = null;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*原始对象中的字符串和数组不受到克隆对象设置值的影响（会创建一个独立的），而类对象变量则会受到了克隆对象的影响。如list、map........ ;static修饰的也将是以引用的形式克隆
	 * */
	@Override
	public ConcretePrototype1 Clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("Cloning ConcretePrototype1 object..");
		return (ConcretePrototype1)super.clone();
	}

	public String toString() {
		return "ConcretePrototype1";
	}

}
