package interview.designpattern.decorator;

public class GrilDecoratorSing extends GrilDecorator {

    public GrilDecoratorSing(Girl girl) {
        super(girl);
        // TODO Auto-generated constructor stub
    }

    public void show() {
        super.show();
        System.out.println("I can sing.");
    }
}
