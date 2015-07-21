package memento;

public class Memento {
    String xue = "";
    String neili = "";
    
    public String getXue() {
        return xue;
    }
    public void setXue(String xue) {
        this.xue = xue;
    }
    public String getNeili() {
        return neili;
    }
    public void setNeili(String neili) {
        this.neili = neili;
    }
    
    public Memento(String xue, String neili) {
        this.xue = xue;
        this.neili = neili;
    }
}
