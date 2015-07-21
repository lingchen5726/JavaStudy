package visitor;

public class Success extends Visitor {

    @Override
    public void getManConclusion(Person p) {
        // TODO Auto-generated method stub
        System.out.println(p.toString()+" "+this.toString()+"时，背后多半有一个伟大的女人。");
    }

    @Override
    public void getWomanConclusion(Person p) {
        // TODO Auto-generated method stub
        System.out.println(p.toString()+" "+this.toString()+"时，背后多半有一个不成功的男人。");
    }

    @Override
    public String toString() {
        return "成功";
    }
    
}
