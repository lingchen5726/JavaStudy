package interview.designpattern.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class OperatorFactory {

    public static AbstractOperator getConcreteCalculator(String operator) {
        // TODO Auto-generated method stub
        AbstractOperator cc = null;
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(new File("src/interview/designpattern/factory/SingleFactoryReflect.properties")));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String className = (String)(props.get(operator));
        try {
            Class c = Class.forName(className);
            Constructor con;
            try {
                con = c.getConstructor();
                cc = (AbstractOperator)(con.newInstance());
                return cc;
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
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
        
        /*
        switch (operator) {
            case 1:
                cc = new AddOperator();
                break;
            case 2:
                cc = new SubOperator();
                break;
            default:
                break;
        }
        */
        return cc;
    }

}
