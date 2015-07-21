package interview.designpattern.visitor;

public class Success extends Visitor {

    @Override
    public void getManConclusion(Person person) {
        // TODO Auto-generated method stub
        System.out.println(person.toString()+" succeed with a great woman behind him.");
    }

    @Override
    public void getWomanConclusion(Person person) {
        // TODO Auto-generated method stub
        System.out.println(person.toString()+" succeed with a diaosi man behind him.");
    }

}
