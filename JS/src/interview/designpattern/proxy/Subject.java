package interview.designpattern.proxy;

public abstract class Subject {
    String name;
    public Subject(String name) {
        this.name = name;
    }
    public abstract void request(String target);
}
