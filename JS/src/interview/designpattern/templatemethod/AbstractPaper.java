package interview.designpattern.templatemethod;

public abstract class AbstractPaper {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private int questSize = 2;
    private String[] correctAnswers = new String[]{"b","b"};
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AbstractPaper pa = new Paper("a", "b");
        pa.templateMethod();
        AbstractPaper pb = new Paper("b", "b");
        pb.templateMethod();
    }

    private void templateMethod() {
        // TODO Auto-generated method stub
        int score = 0;
        System.out.println("Q1: Does java support multiple inheritance? a) Yes;  b) No");
        String a1 = answer1();
        System.out.println("Answer:" + a1);
        if (a1==correctAnswers[0]) {
            score+=50;
        }
        System.out.println("Q2: Does java support copy constructor method? a) Yes;  b) No");
        String a2 = answer2();
        System.out.println("Answer:" + a2);
        if (a2==correctAnswers[1]) {
            score+=50;
        }
        System.out.println("Your score is "+score);
    }

    protected abstract String answer1();
    protected abstract String answer2();

}
