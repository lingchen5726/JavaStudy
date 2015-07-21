package interview.designpattern.classdiagram;

public abstract class Bird extends Animal {

    Beak beak;
    Wing[] wing;
    
    public Bird() {
        this.beak = new Beak();
        this.wing = new Wing[2];
        for (int i=0;i<2;i++) {
            this.wing[i] = new Wing();
        }
    }
    
    public abstract Egg lay();
    
}
