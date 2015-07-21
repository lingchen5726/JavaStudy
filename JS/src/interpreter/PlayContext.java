package interpreter;

public class PlayContext {
    String playText;
    
    public PlayContext(String playText) {
        this.playText = playText;
    }
    
    public String getPlayText() {
        return this.playText;
    }
    
    public void setPlayText(String playText) {
        this.playText = playText;
    }
    
    public int getLength() {
        int length = 0;
        if (null!=this.playText) {
            length =  this.playText.length();
        }
        return length;
    }
}
