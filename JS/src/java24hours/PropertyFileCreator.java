package java24hours;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class PropertyFileCreator {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public PropertyFileCreator() {
        Properties prop = new Properties();
        prop.setProperty("username", "admin");
        prop.setProperty("password", "admin");
        try {
            File f = new File("src\\java24hours\\properties.xml");
            FileOutputStream sout = new FileOutputStream(f);
            Date now = new Date();
            prop.storeToXML(sout, "Created on "+now);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block for FileOutputStream sout = new FileOutputStream(f);
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PropertyFileCreator pfc = new PropertyFileCreator();
    }

}
