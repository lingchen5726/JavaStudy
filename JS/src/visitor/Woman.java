package visitor;

public class Woman extends Person{

    @Override
    public void accept(Visitor v) {
        // TODO Auto-generated method stub
        v.getWomanConclusion(this);
    }
    
    @Override
    public String toString() {
        return "女人";
    }

}
