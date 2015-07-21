package ReflectParams;

import java.util.*;
import java.lang.reflect.*;
import java.io.*;

public class SportFactory {
	static String configFile = "src/ReflectParams/ReflectParams.properties";
	public static ISport createSport(String name, int times) {
		ISport sport = null;
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
		try {
			Class<?> c = Class.forName(type);
			try {
				//Constructor<?>[] ccs = c.getConstructors();
				//for (Constructor<?> ccone: ccs) {
				//	System.out.println("Constructor<?> is "+ccone);
				//}
				try {
					//Class<?>[] args = new Class<?>[1];
					//args[0]= int.class;
					//cc = c.getConstructor(args);
					Constructor<?> cc = c.getConstructor(int.class);
					try {
						sport = (ISport)cc.newInstance(times);
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
				} catch (NoSuchMethodException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//cc = ccs[0];
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sport;
	}
	
	public static void main(String[] args) {
		ISport sport = createSport("Badminton", 3);
		sport.play();
	}
}
