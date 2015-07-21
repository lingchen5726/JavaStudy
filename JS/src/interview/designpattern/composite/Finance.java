package interview.designpattern.composite;

public class Finance extends Organization {

    public Finance(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void show(int depth) {
        // TODO Auto-generated method stub
        for (int i=0;i<depth;i++) {
            System.out.print("-");
        }
        System.out.println(this.name+" will be charge of the Finance business");
    }

}
