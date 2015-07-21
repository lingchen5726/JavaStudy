package interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerializable implements Serializable{
    /**
     * FIXME: <A few word of description of what it is about.> 
     */
    private static final long serialVersionUID = -6352786990884938027L;
    public String name;
    public transient String password;
    public static String sname;
    //public String appended;
    
    public static String getSname() {
        return sname;
    }

    public static void setSname(String sname) {
        TestSerializable.sname = sname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void writeSerial() {
        TestSerializable ts = new TestSerializable();
        ts.setName("cl");
        ts.setPassword("123");
        TestSerializable.setSname("SuperStar");
        if (null!=ts) {
            System.out.println("writeSerial, name:"+ts.getName()+", passwd:"+ts.getPassword()+", sname:"+TestSerializable.getSname());
        }
        try {
            FileOutputStream fos = new FileOutputStream("foo");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ts);
            oos.close();
            fos.close();
            //Change it before deSerial to prove the static will only be got from JVM but not serialized file.
            TestSerializable.setSname("Fans");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static TestSerializable deSerial() {
        TestSerializable ts = null;
        try {
            FileInputStream fis = new FileInputStream("foo");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ts = (TestSerializable)ois.readObject();
            ois.close();
            fis.close();
            if (null!=ts) {
                System.out.println("deSerial, name:"+ts.getName()+", passwd:"+ts.getPassword()+", sname:"+TestSerializable.getSname());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ts;
    }
    
    public static void main(String[] args) {
        writeSerial();
        deSerial();
    }
}
