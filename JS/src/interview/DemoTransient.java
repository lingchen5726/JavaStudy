package interview;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DemoTransient implements Serializable {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private transient InputStream is;
    private int majorVer;
    private int minorVer;
    
    DemoTransient(InputStream is) throws IOException {
        System.out.println("DemoTransient called");
        this.is = is;
        DataInputStream dis;
        if (is instanceof DataInputStream)
            dis = (DataInputStream) is;
        else
            dis = new DataInputStream(is);
        if (dis.readInt() != 0xcafebabe)
            throw new IOException("Not a .class file");
        minorVer = dis.readShort();
        majorVer = dis.readShort();
    }
    
    public int getMajorVer() {
        return majorVer;
    }

    public int getMinorVer() {
        return minorVer;
    }

    void showIS() {
        System.out.println(is);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub
        if (args.length !=1) {
            System.err.println("usage: java TransDemo classfile");
            return;
        }
        DemoTransient dt = new DemoTransient(new FileInputStream(args[0]));
        System.out.printf("Minor version number: %d%n", dt.getMinorVer());
        System.out.printf("Major version number: %d%n", dt.getMajorVer());
        dt.showIS();
        
        FileOutputStream fos = new FileOutputStream("x.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(fos);
        
        try{
            FileInputStream fis = new FileInputStream("x.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println();
            dt = (DemoTransient) ois.readObject();
            System.out.printf("Minor version number: %d%n", dt.getMinorVer());
            System.out.printf("Major version number: %d%n", dt.getMajorVer());
            dt.showIS();
        }catch (ClassNotFoundException cnfe) {
            System.err.println(cnfe.getMessage());
        }
    }

}
