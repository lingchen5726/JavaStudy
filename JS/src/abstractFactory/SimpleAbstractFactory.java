package abstractFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.lang.reflect.Constructor;
import java.util.Properties;

public class SimpleAbstractFactory {
    
    private static String configFile = "src/abstractFactory/SimpleAbstractFactoryReflect.properties";
    private static String fieldName = "factoryName";

    public static IUser createUser() {
        IUser iu = null;
        Properties props = new Properties();
        File file = new File(configFile);
        try {
            props.load(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Class<?> c;
        try {
            //Need full path
            c = Class.forName("abstractFactory."+props.getProperty(fieldName)+"User");
            try {
                iu = (IUser)c.newInstance();
            } catch (InstantiationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return iu;
    }
    
    public static IDepartment createDepartment() {
        IDepartment ide = null;
        Properties props = new Properties();
        File file = new File(configFile);
        try {
            props.load(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Class<?> c;
        try {
            c = Class.forName("abstractFactory."+props.getProperty(fieldName)+"Department");
            try {
                ide = (IDepartment)c.newInstance();
            } catch (InstantiationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ide;    
    }
}
