package prototype;

import java.util.Map;
import java.util.HashMap;

public class PrototypeFactory {
	public static class ModelType {
		public static final String CONCRETEPROTOTYPE1 = "ConcretePrototype1";
	}
	
	private static Map<String, Prototype> prototypes = new HashMap<String, Prototype>();

    static
    {
        prototypes.put(ModelType.CONCRETEPROTOTYPE1, new ConcretePrototype1());
    }
 
    //To study Enum & deepCLone
    public enum ModelType2 {
    	ConcretePrototype1("ConcretePrototype1");
    	private final String type;
    	private ModelType2 (String type) {
    		this.type = type;
    	}
    }
    
    public static Prototype getInstance(final String s) throws CloneNotSupportedException {
        return ((Prototype) prototypes.get(s)).Clone();
    }
    
    public static void main(String[] args) {
    	try {
			System.out.println(PrototypeFactory.getInstance(PrototypeFactory.ModelType.CONCRETEPROTOTYPE1).toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
