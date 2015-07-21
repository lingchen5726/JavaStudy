package java24hours;

public class MyException18 {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void getError() {
        //try {
        String[] greek = { "Alpha", "Beta", "Gamma" };
        System.out.println(greek[3]);
/*        } catch (Exception e) {
        //e.printStackTrace();
        System.out.println("Something wrong");
    }
*/        
    }
    
    public static float generateException(float sum, String in) throws Exception {
        int a = 0;
        Exception e1 = null;
        Exception e2 = null;
        try {
            a = 5/0;
        } catch (ArithmeticException e) {
            System.out.println(a+" meet devide 0 error, generateException will ignore it");
            e1 = e;
            //throw e1;
        }
        try {
            sum = sum + Float.parseFloat(in);
        } catch (NumberFormatException e) {
            System.out.println(in+" isn't a number, generateException will ignore it");
            e2 = e;
        } finally {
            //throw e1;
            //Unreachable code 
            //throw e2;
        }
        return sum;
    }
    
    public static void main(String[] arguments) {
        float sum = 0;
        for (int i = 0; i < arguments.length; i++) {
            try {
                sum = generateException(sum, arguments[i]);
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                System.out.println(arguments[i]+" isn't a number, main will ignore it");
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Devide 0 error, exit");
                break;
            }
        }
        System.out.println("Those numbers add up to " + sum);
    }
 }
