package interview.designpattern.builder;

public abstract class Builder {
    protected Product product = new Product();
    public abstract void buildBread();
    public abstract void buildChicken();
    public Product getProduct() {
        return product;
    }
}
