package interview.designpattern.bridge;

public class Bridge {
    public static void main(String[] args) {
        Brand ba = new BrandA("HuaWei");
        Soft sg = new SoftGame("Angry Bird");
        Soft sc = new SoftContact("TongXun Lu");
        ba.addSoft(sg);
        ba.addSoft(sc);
        ba.show();

        Brand bs = new BrandS("Samsung");
        bs.addSoft(sg);
        bs.addSoft(sc);
        bs.show();
    }
}
