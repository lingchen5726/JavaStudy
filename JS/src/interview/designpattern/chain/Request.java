package interview.designpattern.chain;

public class Request {
    private String requester;
    private String type;
    private int num;
    
    /**
     * @return the requester
     */
    public String getRequester() {
        return requester;
    }

    /**
     * @param requester the requester to set
     */
    public void setRequester(String requester) {
        this.requester = requester;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Request(String requester, String type, int num) {
        this.setRequester(requester);
        this.type = type;
        this.num = num;
    }
}
