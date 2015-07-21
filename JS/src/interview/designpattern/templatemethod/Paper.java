package interview.designpattern.templatemethod;

public class Paper extends AbstractPaper {

    String answer1;
    String answer2;
    
    public Paper(String answer1, String answer2) {
        // TODO Auto-generated constructor stub
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    @Override
    protected String answer1() {
        // TODO Auto-generated method stub
        return this.answer1;
    }

    @Override
    protected String answer2() {
        // TODO Auto-generated method stub
        return this.answer2;
    }

}
