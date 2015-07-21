package java24hours;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileExample {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private static void getMp3Info() {
        try {
            File f = new File("D:\\Users\\Robert\\leisure\\songs\\engSong\\hero.mp3");
            FileInputStream fs = new FileInputStream(f);
            long size = f.length();
            if (size>128) {
                try {
                    fs.skip(size-128);
                    byte[] last128 = new byte[128];
                    fs.read(last128);
                    String info = new String(last128);
                    String tag = info.substring(0, 3);
                    if (tag.equals("TAG")) {
                        System.out.println("Title: " + info.substring(3, 32));
                        System.out.println("Artist: " + info.substring(33, 62));
                        System.out.println("Album: " + info.substring(63, 91));
                        System.out.println("Year: " + info.substring(93, 97)); 
                    } else {
                        System.out.println("No MP3 info");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("File size is "+f.length());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void getFilesByFolderPath() {
        File folder = new File("src\\java24hours");
        File[] fl = folder.listFiles();
        for (File f:fl) {
          System.out.println(f.getName());
        }
    }
    
    private static void dumpFile(String filePath) {
        File file = new File(filePath);
        try {
            FileOutputStream fs = new FileOutputStream(file);
            write(fs, "username=max");
            write(fs, "score=12550");
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Could not write file");
        }
        
    }
    
    private static void write(FileOutputStream fs, String output) throws IOException {
        // TODO Auto-generated method stub
        String newline = System.getProperty("line.separator");
        output = output + newline;
        byte[] data = output.getBytes();
        fs.write(data, 0, data.length);
        
    }

    private static void getAndSetProperties(String filePath) {
        File file = new File(filePath);
        try {
            FileInputStream fsin = new FileInputStream(file);
            Properties p = new Properties();
            p.load(fsin);
            p.list(System.out);
            String name = p.getProperty("username");
            System.out.println("Original name is "+name);
            p.setProperty("username", "min");
            FileOutputStream fsout = new FileOutputStream(file);
            p.store(fsout, "Changed username from max to min");
            fsin.close();
            p.list(System.out);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("IO error "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //getFilesByFolderPath();
        //getMp3Info();
        //dumpFile("src\\java24hours\\program.properties");
        getAndSetProperties("src\\java24hours\\program.properties");
    }

}
