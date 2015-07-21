package composite;

public abstract class Component {
    protected String name;
    public Component (String name) {
        this.name = name;
    }
    
    String showDepth(int depth) {
        String prefix = "";
        for (int i=0;i<depth;i++) {
            prefix = prefix.concat("-");
        }
        return prefix;
    }
    
    public abstract void add (Component c);
    public abstract void remove (Component c);
    public abstract void show (int depth);
    public abstract void lineOfDuty();
}
