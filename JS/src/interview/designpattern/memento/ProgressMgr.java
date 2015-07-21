package interview.designpattern.memento;

import java.util.HashMap;

public class ProgressMgr {
    private HashMap<String, Progress> ps = new HashMap<String, Progress>();

    public void save(String progressName, Progress progress) {
        // TODO Auto-generated method stub
        ps.put(progressName, progress);
    }

    public Progress get(String progressName) {
        // TODO Auto-generated method stub
        return ps.get(progressName);
    }
    
    
}
