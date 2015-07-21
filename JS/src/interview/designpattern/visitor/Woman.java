package interview.designpattern.visitor;

public class Woman extends Person {

    @Override
    void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.getWomanConclusion(this);
    }

}
