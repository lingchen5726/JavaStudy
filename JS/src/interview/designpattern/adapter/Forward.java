package interview.designpattern.adapter;

public class Forward extends Target {

    public Forward(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.println(name+" attack...");
    }

    @Override
    public void defense() {
        // TODO Auto-generated method stub
        System.out.println(name+" defend...");

    }

}
