package chain;

public abstract class Handler {
    private String name;
    private Handler successor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Handler getSuccessor() {
        return successor;
    }

    public Handler(String name) {
        this.name = name;
    }
    
    public void setSuccessor(Handler s) {
        this.successor = s;
    }

    public void nextHandle(Request r) {
        if (null!=getSuccessor()) {
            getSuccessor().Handle(r);
        } else {
            System.out.println(r.getRequester()+"'s "+r.getType()+"("+r.getVolumn()+") was rejected by "+getName());
        }
    }

    public abstract void Handle(Request r);
    
}
