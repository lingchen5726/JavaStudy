package SimpleFactoryReflectInner;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestPureReflec {
	
	private interface ISport {
		void play();
	}

	private class Badminton implements ISport {

		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("Play badminton");
		}
		
	}

	private class Football implements ISport {

		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("Play Football");
		}
		
	}
	
	public static class SportFactory {
		static String configFile = "src/SimpleFactoryReflectInner/SimpleFactoryReflectInner.properties";
		
		public static ISport createSport(String name) {
			ISport sport = null;
			try {
				Properties props = new Properties();
				File file = new File(configFile);
				try {
					props.load(new FileInputStream(file));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Class<?> c = Class.forName(props.getProperty(name));
				Constructor<?> cc = c.getDeclaredConstructors()[0];
				cc.setAccessible(true);
				try {
					sport = (ISport)cc.newInstance(new TestPureReflec());
					return sport;
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

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return sport;
		}
	}
	
	public static void main(String[] args) {
		ISport sport = SportFactory.createSport("PureReflecFootball");
		if (null!=sport) {
			sport.play();
		}
	}
}

