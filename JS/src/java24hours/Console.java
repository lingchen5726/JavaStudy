package java24hours;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Console {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
        public static String readLine() {
            StringBuffer response = new StringBuffer();
            try {
                BufferedInputStream bin = new
                    BufferedInputStream(System.in);
                int in = 0;
                char inChar;
                do {
                    in = bin.read();
                    inChar = (char) in;
                    if (in != -1) {
                        response.append(inChar);
                    }             
                } while ((in != -1) & (inChar != '\n'));
                bin.close();
                return response.toString();
            } catch (IOException e) {
                System.out.println("Exception: " + e.getMessage());
                return null;
            }
        }
    
        public static void main(String[] arguments) {
            System.out.print("You are standing at the end of the road ");
            System.out.print("before a small brick building. Around you ");
            System.out.print("is a forest. A small stream flows out of ");
            System.out.println("the building and down a gully.\n");
            String input = "";
            do {
                System.out.print("Please try> ");
                input = Console.readLine();
            } while (!(input.equals("Yes\r\n")));
            System.out.println("Well done");
        }
}
