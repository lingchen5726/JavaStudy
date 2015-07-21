package java24hours;

public class String6 {

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
        String strTest = "Paul Walker";
        if (null!=strTest) {
            System.out.println("Length of strTest is: "+strTest.length());
        }
        String strUpperTest = strTest.toUpperCase();
        String strLowerTest = strTest.toLowerCase();
        System.out.println("The \""+strUpperTest+"\" equals \""+strLowerTest+"\"? "+strUpperTest.equals(strLowerTest));
        String strSub = "a";
        System.out.println("The start position of strTest begins with \""+strSub+"\" is:"+strTest.indexOf(strSub));
    }

}
