package bridge;

public abstract class Soft {
    String name;
    
    public Soft(String name) {
        this.name = name;
    }
    
    public abstract void run();
}
