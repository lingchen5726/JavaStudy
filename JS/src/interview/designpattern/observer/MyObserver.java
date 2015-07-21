package interview.designpattern.observer;

public abstract class MyObserver {
    private String name;
    
    public MyObserver(String name) {
        this.name = name;
    }
    
    public abstract void gengxin(String event);
}
