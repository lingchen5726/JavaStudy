package prototype;

public class Client implements Cloneable{

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    
    String name="";
    Client(String name) {
        this.name = name;
    }
    
    public void show() {
        System.out.println(this.name);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Client a = new Client("A");
        try {
            Client b = (Client)(a.clone());
            b.show();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
