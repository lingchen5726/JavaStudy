package java24hours;

import java.io.UnsupportedEncodingException;

public class TestVariable {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s = "哈";
        System.out.println(s.length());
        byte b[];
        String[] charSet = {"GBK", "UTF-8", "Unicode"};
        for (String str:charSet) {
            try {
                b = s.getBytes(str);
                System.out.println(b.length);
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
