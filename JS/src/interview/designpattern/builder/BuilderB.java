package interview.designpattern.builder;

public class BuilderB extends Builder {

    @Override
    public void buildBread() {
        // TODO Auto-generated method stub
        product.addParts("French toast");
    }

    @Override
    public void buildChicken() {
        // TODO Auto-generated method stub
        product.addParts("Big chicken leg");
    }

}
