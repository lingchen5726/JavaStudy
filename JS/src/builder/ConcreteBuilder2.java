package builder;

public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();
    
    @Override
    public void buildPartA() {
        // TODO Auto-generated method stub
        product.addPart("Java");
    }

    @Override
    public void buildPartB() {
        // TODO Auto-generated method stub
        product.addPart("javac");
    }

    @Override
    public Product getResult() {
        // TODO Auto-generated method stub
        return product;
    }

}
