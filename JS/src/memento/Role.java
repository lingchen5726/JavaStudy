package memento;

public class Role {
    String name;
    
    String xue = "";
    String neili = "";
    
    public String getNeili() {
        return neili;
    }

    public void setNeili(String neili) {
        this.neili = neili;
    }

    public String getXue() {
        return xue;
    }

    public void setXue(String xue) {
        this.xue = xue;
    }

    public Role(String name) {
        this.name = name;
    }
    
    public void init() {
        setXue("100");
        setNeili("100");
    }
    
    public void show() {
        System.out.println(name+": Xue("+getXue()+"), Neili("+getNeili()+")");
    }
    
    public Memento save() {
        Memento m = new Memento(getXue(), getNeili());
        return m;
    }
    
    public void recover(Memento m) {
        setXue(m.getXue());
        setNeili(m.getNeili());
    }
    
    public void fightBoss() {
        setXue("0");
        setNeili("0");
    }
}
