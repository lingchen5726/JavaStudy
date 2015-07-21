package interview.designpattern.builder;

public class BuilderA extends Builder {

    @Override
    public void buildBread() {
        // TODO Auto-generated method stub
        product.addParts("Toast");
    }

    @Override
    public void buildChicken() {
        // TODO Auto-generated method stub
        product.addParts("Chicken Leg");
    }


}
