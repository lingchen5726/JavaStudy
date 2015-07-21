package interview.designpattern.decorator;

public class GrilDecorator extends Girl {

    private Girl girl;
    
    public GrilDecorator(Girl girl) {
        this.girl = girl;
    }
    
    @Override
    public void show() {
        // TODO Auto-generated method stub
        if (null!=girl) {
            girl.show();
        }
    }

}
