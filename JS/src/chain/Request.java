package chain;

public class Request {
    String requester;
    String type;
    int volumn;
    
    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

    public Request(String requester, String type, int volumn) {
        this.requester = requester;
        this.type = type;
        this.volumn = volumn;
    }
    
}
