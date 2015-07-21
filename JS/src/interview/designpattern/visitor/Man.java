package interview.designpattern.visitor;

public class Man extends Person {

    @Override
    void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.getManConclusion(this);
    }

}
