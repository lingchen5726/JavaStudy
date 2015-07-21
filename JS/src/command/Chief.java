package command;

public class Chief {
    String name;
    
    public Chief(String name) {
        this.name = name;
    }
    
    public void bakeYRC() {
        System.out.println(name+": Kao yrc...");
    }
    
    public void beer() {
        System.out.println(name+": Zhunbei beer...");
    }
}
