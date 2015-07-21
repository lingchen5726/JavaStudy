package interview.designpattern.bridge;

import java.util.ArrayList;

public class Brand {
    private String brandName;
    
    public Brand(String brandName) {
        this.brandName = brandName;
    }
    
    //Here is the key of the bridge pattern, "has a" is much more flexible than "is a"
    protected ArrayList<Soft> softs = new ArrayList<Soft>();
    
    public void addSoft(Soft soft) {
        softs.add(soft);
    }
    
    public void show() {
        System.out.println("On "+brandName);
        for (Soft soft: softs) {
            soft.run();
        }
        System.out.println();
    }
}
