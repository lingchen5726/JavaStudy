package SimpleFactoryReflectInner;

import java.lang.reflect.*;

public class TestInner{
	   private class Inner{
	   }
	   public static void main(String[] args){
	      System.out.println(Inner.class);
	      System.out.println(Inner.class.getDeclaredConstructors().length);
	      Constructor<?> c = Inner.class.getDeclaredConstructors()[0];
	      c.setAccessible(true);
	      try {
			System.out.println("Inner.class.getDeclaredConstructors()[0].setAccessible(true).newInstance(new TestInner())"+c.newInstance(new TestInner()));
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
	}