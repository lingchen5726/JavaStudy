package interview;

import java.util.HashMap;
import java.util.Map;

public class FinallyTest1 {

    public static void main(String[] args) {
        
        System.out.println(test1()+"\n");
        System.out.println(test2()+"\n");
        System.out.println(test3()+"\n");
        System.out.println(getMap().get("KEY")+"\n");
        System.out.println(test4());
    }

    public static int test1() {
        int b = 20;

        //System.exit(0);
        
        try {
            System.out.println("try block");

            return b += 80; 
        }
        catch (Exception e) {

            System.out.println("catch block");
        }
        finally {
            
            System.out.println("finally block");
            
            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }
        }
        
        return b;
    }

    public static int test2() {
        int b = 20;

        try {
            System.out.println("try block");

            return b += 80;
        } catch (Exception e) {

            System.out.println("catch block");
        } finally {

            System.out.println("finally block");

            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }

            return 200;
        }

        //Unreachable code return b;
    }

    public static int test3() {
        int b = 20;

        try {
            System.out.println("try block");
            //If add this, will return 2000: int j = 1/0;
            return b += 80;
        } catch (Exception e) {

            System.out.println("catch block");
        } finally {

            System.out.println("finally block");

            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }

            b = 150;
        }

        return 2000;
    }   
    
    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("KEY", "INIT");
        
        try {
            map.put("KEY", "TRY");
            return map;
        } catch (Exception e) {
            map.put("KEY", "CATCH");
        } finally {
            map.put("KEY", "FINALLY");
            map = null;
        }
        
        return map;
        
    }
    
    public static int test4() {
        int b = 20;

        try {
            System.out.println("try block");

            b = b / 0;

            return b += 80;
        } catch (Exception e) {

            b += 15;
            System.out.println("catch block");
            return b;
        } finally {

            System.out.println("finally block");

            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }

            b += 50;
        }

        //return b;
    }
    
}
