package java24hours;

public class Param {

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
        if (null!=args && null!=args[0]) { 
            if (!("".equals(args[0]))) {
                int num = Integer.parseInt(args[0]);
                System.out.println("The root of "+num+" is: "+Math.sqrt(num));
            } else { 
                System.out.println("Input parameter is \"\"");
            }
        }else {
            System.out.println("Input parameter is null");
        }
    }

}
