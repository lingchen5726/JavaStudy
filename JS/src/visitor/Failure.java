package visitor;

public class Failure extends Visitor {

    @Override
    public void getManConclusion(Person p) {
        // TODO Auto-generated method stub
        System.out.println(p.toString()+" "+this.toString()+"时，闷头喝酒，谁也不用劝。");
    }

    @Override
    public void getWomanConclusion(Person p) {
        // TODO Auto-generated method stub
        System.out.println(p.toString()+" "+this.toString()+"时，眼泪汪汪，谁也劝不了。");
    }

    @Override
    public String toString() {
        return "失败";
    }
    
}
