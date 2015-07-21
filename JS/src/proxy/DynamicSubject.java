package proxy;

public class DynamicSubject implements Subject {

    String name;
    
    public DynamicSubject(String name) {
        this.name = name;
    }
    
    @Override
    public void request(String obj) {
        // TODO Auto-generated method stub
        System.out.println("Dear "+obj+": I'm "+name+", shall we go to cinema?");
    }

}
