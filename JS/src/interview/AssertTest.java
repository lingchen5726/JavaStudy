package interview;

public class AssertTest {
    public static void main(String[] args) {
        System.out.println("Entry of AssertTest");
        try {
            assert false:"MyTest";
        } catch (AssertionError ae) {
            System.out.println(ae.getMessage());
        }
    }
}
