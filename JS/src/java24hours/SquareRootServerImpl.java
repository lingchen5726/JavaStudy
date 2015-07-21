package java24hours;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface = "java24hours.SquareRootServer")
public class SquareRootServerImpl implements SquareRootServer {

    public SquareRootServerImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getSquareRoot(double input) {
        // TODO Auto-generated method stub
        return Math.sqrt(input);
    }

    @Override
    public String getTime() {
        // TODO Auto-generated method stub
        Date date = new Date();
        return date.toString();
    }

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

    }

}
