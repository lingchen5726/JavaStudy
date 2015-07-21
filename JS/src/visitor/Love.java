package visitor;

public class Love extends Visitor {

    @Override
    public void getManConclusion(Person p) {
        // TODO Auto-generated method stub
        System.out.println(p.toString()+" "+this.toString()+"时，不懂也要装懂。");
    }

    @Override
    public void getWomanConclusion(Person p) {
        // TODO Auto-generated method stub
        System.out.println(p.toString()+" "+this.toString()+"时，懂也装作不懂。");
    }
    
    @Override
    public String toString() {
        return "恋爱";
    }

}
