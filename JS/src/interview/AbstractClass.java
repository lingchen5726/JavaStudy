package interview;

public abstract class AbstractClass {
    public static int CONSTINT = 5;
    static {CONSTINT +=5;}
    public int method(int a){return 5;}
    public abstract void anotherMethod();
    public void method() {
        
    }
    
    public static void main(String[] args) {
        ChildA a= new ChildA();
        a.method();
        a.anotherMethod();
    }
}

class ChildA extends AbstractClass {

    @Override
    public void anotherMethod() {
        // TODO Auto-generated method stub
        System.out.println("ChildA.anotherMethod: Do sth abstract here.");
    }
    
    public void method() {
        System.out.println("ChildA.method: Do sth here.");
    }
    
}