package interview;

import java.util.Arrays;

public class StringTest {

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
        String str = "工作";
        //char[] charArray = new char[30];
        char[] charArray = str.toCharArray();
        byte[] byteArray = str.getBytes();
        System.out.println(str.length());
        System.out.println(charArray.length);
        System.out.println(byteArray.length);
        Arrays.sort(charArray);
        System.out.println(charArray);
        System.out.println(Arrays.toString(charArray));
        System.out.println(str.charAt(1));
    }

}
