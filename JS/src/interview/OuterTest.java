package interview;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class OuterTest {
    public static int stInt = 1;
    public int pubInt = 2;
    
    public void method() {
        new Inner1();
    }
    
    private void priMethod() {
        System.out.println("OuterTest.priMethod");
    }
    
    public class Inner1 {}
    
    public static class Inner2 {}
    
    public static void main(String[] args) {
        OuterTest.Inner2 inn2 = new Inner2();
        OuterTest o = new OuterTest();
        Inner1 inn1 = o.new Inner1();
        new OuterTest.Inner2();
        MyTest mt = new MyTest();
        mt.priMethod();
        
        OuterTest.stInt = 2;
        OuterTest ot = new OuterTest();
        ot.pubInt = 3;
        /*if str = "ABC"
         *  bytes Default' size: 3
            bytes GBK' size: 3
            bytes UTF-8' size: 3
            bytes UTF-16' size: 8
            bytes Unicode' size: 8
         * */
        String str = "ABC你好";
        /*bytes Default' size: 9
            bytes GBK' size: 7
            bytes UTF-8' size: 9
            bytes UTF-16' size: 12
            bytes Unicode' size: 12
         * */
        try {
            byte[] bytesDefault = str.getBytes();
            System.out.println("bytes Default' size: "+bytesDefault.length);
            byte[] bytesGBK = str.getBytes("GBK");
            System.out.println("bytes GBK' size: "+bytesGBK.length);
            byte[] bytesUTF8 = str.getBytes("UTF-8");
            System.out.println("bytes UTF-8' size: "+bytesUTF8.length);
            byte[] bytesUTF16 = str.getBytes("UTF-16");
            System.out.println("bytes UTF-16' size: "+bytesUTF16.length);
            byte[] bytes = str.getBytes("Unicode");
            System.out.println("bytes Unicode' size: "+bytes.length);
            
            String strUTF16back = new String(bytesUTF16, "UTF-16");
            System.out.println("strback is:"+strUTF16back);
            char c = '你';
            String newStr = String.valueOf(c);
            byte[] bc = newStr.getBytes();
            System.out.println(bc.length);
            int i = 0;
            Integer ci = (Integer)i;
            i = (int)ci;
            
            new Thread(new Runnable(){
                public void run() {
                    for (int i=0;i<3;i++) {
                        System.out.println(Thread.currentThread().toString());
                    }
                }
            }, "Ling").start();
            
            ArrayList<String> al = new ArrayList<String>();
            Iterator itr = al.iterator();
            ListIterator litr = null;
            List list = Collections.synchronizedList(al);
            CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<String>();
            concatStr();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    private static void concatStr() {
        // TODO Auto-generated method stub
        String strA = "A";
        String strB = "B";
        String concatStr = strA+strB;
        String ocncatStr2 = strA.concat(strB);
        System.out.println("concatStr:"+concatStr+", ocncatStr2:"+ocncatStr2);

        String strA2 = "A";
        checkInstance(strA, strA2);
        String strA3 = new String("A");
        checkInstance(strA, strA3);
        
    }

    private static void checkInstance(String str1, String str2) {
        // TODO Auto-generated method stub
        if (str1==str2) {
            System.out.println(str1+" and "+str2+" are same instances");
        } else {
            System.out.println(str1+" and "+str2+" are different instances");
        }
    }
    
}

class MyTest extends OuterTest{
    protected void priMethod() {
        System.out.println("MyTest.priMethod");
    }
}
