package adapter;

public abstract class Player {
    String name;
    
    public Player(String name) {
        setName(name);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void attack();
    public abstract void defense();
}
