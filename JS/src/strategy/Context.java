package strategy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Context {
	Strategy strategy = null;
	static final String configFile = "src/strategy/strategy.properties";
	
	/*Original:
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	Switch:
	public Context(int type) {
		switch (type) {
		case 1:
			strategy = new ConcreteStrategyA();
			break;
		case 2:
			strategy = new ConcreteStrategyB();
			break;
		default:
			break;
		}
	}
	*/
	//Reflect
	public Context(String name) {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File(configFile)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String type = props.getProperty(name);
		Class<?> c=null;
		try {
			c = Class.forName(type);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Constructor<?> cc=null;
		try {
			cc = c.getConstructor();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			strategy = (Strategy)(cc.newInstance());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ContextCalculate()	{
		strategy.AlgorithmInterface();
	}
	
	public static void main(String[] args) {
		/*Original:
		Context ca = new Context(new ConcreteStrategyA());
		ca.ContextCalculate();
		Context cb = new Context(new ConcreteStrategyB());
		cb.ContextCalculate();
		Switch:
		Context c1 = new Context(1);
		c1.ContextCalculate();
		Context c2 = new Context(2);
		c2.ContextCalculate();
		*/
		//Reflect
		Context ca = new Context("A");
		ca.ContextCalculate();
		Context cb = new Context("B");
		cb.ContextCalculate();
	}
}
