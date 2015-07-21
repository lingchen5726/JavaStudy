package bridge;

public class Protect {

    public String strPublic;
    protected String strProtect;
    private String strPrivate;
    
    public Protect(String pub, String pro, String pri) {
        this.strPublic = pub;
        this.strProtect = pro;
        this.strPrivate = pri;
    }
    
    public void mPublic() {
        System.out.println("Protect -> public method, "+this.strPublic);
    } 
    
    protected void mProtect() {
        System.out.println("Protect -> protected method, "+this.strProtect);
    }
    
    private void mPrivate() {
        System.out.println("Protect -> private method, "+this.strPrivate);
    } 
}
