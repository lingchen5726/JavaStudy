package interview.designpattern.memento;

public class Progress {
    private int hp;
    private int exp;
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Progress(int hp, int exp) {
        this.hp = hp;
        this.exp = exp;
    }

}
