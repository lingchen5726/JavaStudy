package adapter;

public class NativePlayer extends Player {

    public NativePlayer(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.println(this.getName()+" attack");
    }

    @Override
    public void defense() {
        // TODO Auto-generated method stub
        System.out.println(this.getName()+" defense");
    }

}
