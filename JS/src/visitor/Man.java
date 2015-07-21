package visitor;

public class Man extends Person {

    @Override
    public void accept(Visitor v) {
        // TODO Auto-generated method stub
        v.getManConclusion(this);
    }
    
    @Override
    public String toString() {
        return "男人";
    }

}
