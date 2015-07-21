package interview;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Writer;

public class TestWrite {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private static String SEPORATOR = File.separator;
    private static String filename = "D:"+SEPORATOR + "Users"+SEPORATOR+"Robert"+SEPORATOR+"workspace"+SEPORATOR+"JS"+SEPORATOR+"src"+SEPORATOR+"tjpl"+SEPORATOR+"test2.txt";
    private static final File f = new File(filename);
    
    public static void writeByte() {
        try {
            OutputStream out = new FileOutputStream(f);
            String str = "我";
            out.write(str.getBytes("Unicode"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void appendByte() {
        try {
            FileOutputStream ao = new FileOutputStream(f, true);
            String str = "\nappendByte";
            ao.write(str.getBytes());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void writeChar() {
        try {
            Writer w = new FileWriter(f);
            String str = "我是一个兵";
            w.write(str);
            //w.flush();
            w.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void appendChar() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
            String str = "\nappendChar";
            bw.append(str);
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void read3BytesAfterNBytes(int n) {
        try {
            FileInputStream fis = new FileInputStream(f);
            //fis.skip(n);
            byte[] b15 = new byte[15];
            int len = 0;
            fis.read(b15);
            byte[] b3 = new byte[3];
            for (int i=n,j=0;j<3;i++) {
                b3[j++]=b15[i];
            }
            String str = new String(b3);
            System.out.println("Skipped "+n+", got:"+str);
            fis.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void readByteAfterNBytes(int n) {
        try {
            FileInputStream fis = new FileInputStream(f);
            fis.skip(n);
            int i = fis.read();
            char c = (char)i;
            System.out.println("Skipped "+n+", got:"+c);
            fis.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void randomAccessReadAfterNBytes(int n) {
        try {
            RandomAccessFile raf = new RandomAccessFile(filename, "r");
            raf.skipBytes(n);
            int i = raf.read();
            char c = (char)i;
            System.out.println("RandomAccessFile: Skipped "+n+", got:"+c);
            raf.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //writeByte();
        //appendByte();
        writeChar();
        //appendChar();
        
        for (int i=0;i<15;i+=3) {
            read3BytesAfterNBytes(i);
            //readByteAfterNBytes(i);
            //randomAccessReadAfterNBytes(i);
        }

    }

}
