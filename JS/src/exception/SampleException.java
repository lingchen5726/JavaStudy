package exception;

public class SampleException extends Exception {

    /**
     * FIXME: <A few word of description of what it is about.> 
     */
    private static final long serialVersionUID = 1L;

    public SampleException() {
        // TODO Auto-generated constructor stub
    }

    public SampleException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public SampleException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    public SampleException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
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
    
    public static int sampleCase(int i, int j) throws SampleException{
        if (j>1000000) {
             throw new SampleException("J is larger than 1000000.");
        } else {
            return i+j;
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            for (String arg:args) {
                System.out.println(arg);
            }
            System.out.println(sampleCase(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
            //System.out.println(sampleCase(1,1000001));
        } catch (SampleException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
            e.getCause();
        }
    }

}
