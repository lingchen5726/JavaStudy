package interview.designpattern.visitor;

public class Fail extends Visitor {

    @Override
    public void getManConclusion(Person person) {
        // TODO Auto-generated method stub
        System.out.println(person.toString()+" failed, jie jiu xiao chou.");
    }

    @Override
    public void getWomanConclusion(Person person) {
        // TODO Auto-generated method stub
        System.out.println(person.toString()+" failed, lei liu man mian.");
    }

}
