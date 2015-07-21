package bridge;

import java.util.ArrayList;

public class Brand {
    String name;
    ArrayList<Soft> softs = new ArrayList<Soft>();
    public Brand(String name) {
        this.name = name;
    }
    public void add(Soft s) {
        softs.add(s);
    }
    
    public void remove(Soft s) {
        softs.remove(s);
    }

    public void show() {
        for (Soft s:softs) {
            s.run();
        }
    }
    
}
