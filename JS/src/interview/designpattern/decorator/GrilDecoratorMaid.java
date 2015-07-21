package interview.designpattern.decorator;

public class GrilDecoratorMaid extends GrilDecorator {

    public GrilDecoratorMaid(Girl girl) {
        super(girl);
        // TODO Auto-generated constructor stub
    }

    public void show() {
        super.show();
        System.out.println("Maid cosplay...");
    }
    
}
